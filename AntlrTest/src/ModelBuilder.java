import java.io.*;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import extractor.ExtractClassListener;

import antlr.gencode.Java7Lexer;
import antlr.gencode.Java7Parser;


public class ModelBuilder {
	public static void buildModel(File file) throws FileNotFoundException, IOException{
		

		if(file.isDirectory()){
			for(String fName: file.list()){
				File f = new File(file.getPath()+"/"+fName);
				buildModel(f);
			}
		}else if(file.getName().endsWith(".java")){
			parseFile(file);
		}
	}
	
	private static void parseFile(File src) throws FileNotFoundException, IOException{
		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(src.getPath()));
		
		Java7Lexer lexer = new Java7Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		Java7Parser parser = new Java7Parser(tokens);
		
		ParseTree tree = parser.compilationUnit();
		
		ParseTreeWalker walker = new ParseTreeWalker();
		ExtractClassListener extractor = new ExtractClassListener(parser);		
		walker.walk(extractor, tree);
	}
}
