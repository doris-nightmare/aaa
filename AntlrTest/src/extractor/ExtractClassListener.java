package extractor;

import org.antlr.v4.runtime.TokenStream;

import antlr.gencode.Java7BaseListener;
import antlr.gencode.Java7Parser;

//it seems that all the logic needs to be written in the listener
public class ExtractClassListener extends Java7BaseListener {
	Java7Parser parser;
	
	public ExtractClassListener(Java7Parser parser){
		this.parser = parser;
		System.out.println("initialization");

		
	}
	
	@Override
	public void enterClassDeclaration(Java7Parser.ClassDeclarationContext ctx){
		System.out.println("Begin Parse");
		
	}
	
	@Override
	public void exitClassDeclaration(Java7Parser.ClassDeclarationContext ctx){
		System.out.println("End parse");
	}
	
	@Override
	public void enterMethodDeclaration(
	        Java7Parser.MethodDeclarationContext ctx
	    )
	{
		TokenStream tokens = parser.getTokenStream(); 
		String type = "void";
		if ( ctx.typeRef()!=null ) {
		    type = tokens.getText(ctx.typeRef());
		}
		String args = tokens.getText(ctx.formalParameters());
	System.out.println("\t"+type+" "+ctx.Identifier()+args+";"); }
}
