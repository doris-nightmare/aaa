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
	
	
	public static void main(String[] args){
		
		String headFirst = "./testcases/headfirst/composite";
		try {
			File dir = new File(headFirst);
			ModelBuilder.buildModel(dir);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}