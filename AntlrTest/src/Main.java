import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import extractor.ExtractClassListener;


import antlr.gencode.*;


public class Main{
	
	private static void printName(File file, String prefix) throws IOException{
		System.out.println(prefix+file.getName());

		if(file.isDirectory()){
			for(String fName: file.list()){
				File f = new File(file.getPath()+"/"+fName);
				printName(f,prefix+"  ");
			}
		}		
	}
	public static void main(String[] args){
		ANTLRInputStream input;
		String headFirst = "/Users/Doris/Dropbox/ResearchesOnDropBox/ResearchOnDPD/GraduationProject/TestCases/HeadFirstDesignPatterns_code102507/HF_DP/src/headfirst";
		try {
			File dir = new File(headFirst+"/adapter");
			//printName(dir,"");
			
			input = new ANTLRInputStream(new FileInputStream("/Users/Doris/Documents/workspace/antlr/AntlrTest/src/Test.java"));
			Java7Lexer lexer = new Java7Lexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			Java7Parser parser = new Java7Parser(tokens);
			
			
			// name is the first rule in a grammar file 
			ParseTree tree = parser.compilationUnit();
			for(int i=0; i< tree.getChildCount();i++){
				ParseTree subtree = tree.getChild(i);
				
				System.out.println(subtree.getText());
			}
			
			//System.out.println(tree.toStringTree(parser));
			
//			ParseTreeWalker walker = new ParseTreeWalker();
//			ExtractClassListener extractor = new ExtractClassListener(parser);		
//			walker.walk(extractor, tree);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}