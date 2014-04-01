package extractor;

import metamodel.ClassEntity;

import org.antlr.v4.runtime.TokenStream;
import java.util.*;

import antlr.gencode.Java7BaseListener;
import antlr.gencode.Java7Parser;
import antlr.gencode.Java7Parser.ClassOrInterfaceDeclarationContext;
import antlr.gencode.Java7Parser.FieldDeclarationContext;
import antlr.gencode.Java7Parser.InterfaceDeclarationContext;
import antlr.gencode.Java7Parser.NormalClassDeclarationContext;
import antlr.gencode.Java7Parser.NormalInterfaceDeclarationContext;
import antlr.gencode.Java7Parser.PackageDeclarationContext;

//it seems that all the logic needs to be written in the listener
// one listener for one compilation unit

public class ExtractClassListener extends Java7BaseListener {
	//in java, package name can be omitted
	String pkgName=null;
	Java7Parser parser;
	List<ClassEntity> classList;
	 
	ClassEntity currentClass = null;
	
	//constructor
	public ExtractClassListener(Java7Parser parser){
		this.parser = parser;
		classList = new ArrayList<ClassEntity>();
		currentClass = new ClassEntity();
		
	}
	
	@Override
	public void enterPackageDeclaration(PackageDeclarationContext ctx) {
		// TODO Auto-generated method stub
		super.enterPackageDeclaration(ctx);
		pkgName = ctx.qualifiedIdentifier().getText();	
	}
	
	
	@Override
	public void enterClassOrInterfaceDeclaration(
			ClassOrInterfaceDeclarationContext ctx) {
		// TODO Auto-generated method stub
		super.enterClassOrInterfaceDeclaration(ctx);
		
		//System.out.println(ctx.Identifier().toString());
		for(Java7Parser.ModifierContext mctx : ctx.modifier()){
			//System.out.println(mctx.getText());
		}
		currentClass = new ClassEntity();
		currentClass.setPkgName(pkgName);
		classList.add(currentClass);
//		Object a = ctx.classDeclaration().enumDeclaration();
//		Object b = ctx.classDeclaration().normalClassDeclaration();
	}

	
	
	

	
	
	
	
	
	@Override
	public void enterNormalClassDeclaration(NormalClassDeclarationContext ctx) {
		// TODO Auto-generated method stub
		super.enterNormalClassDeclaration(ctx);
		//System.out.println(ctx.Identifier().toString());
		
		//normal class declaration is different from enum
		
		String className = ctx.Identifier().toString();
		currentClass.setName(className);
		
	}

	@Override
	public void exitNormalClassDeclaration(NormalClassDeclarationContext ctx) {
		// TODO Auto-generated method stub
		super.exitNormalClassDeclaration(ctx);
	}

	@Override
	public void enterNormalInterfaceDeclaration(
			NormalInterfaceDeclarationContext ctx) {
		// TODO Auto-generated method stub
		super.enterNormalInterfaceDeclaration(ctx);
		
		String interfaceName = ctx.Identifier().toString();
		currentClass.setName(interfaceName);
		//System.out.println(interfaceName);
	}

	@Override
	public void exitNormalInterfaceDeclaration(
			NormalInterfaceDeclarationContext ctx) {
		// TODO Auto-generated method stub
		super.exitNormalInterfaceDeclaration(ctx);
		String className = ctx.Identifier().toString();
		currentClass.setName(className);
	}

	@Override
	public void enterMethodDeclaration(
	        Java7Parser.MethodDeclarationContext ctx
	    )
	{
		currentClass.addMethod();
		TokenStream tokens = parser.getTokenStream(); 
		String type = "void";
		if ( ctx.typeRef()!=null ) {
		    type = tokens.getText(ctx.typeRef());
		}
		String args = tokens.getText(ctx.formalParameters());
	//System.out.println("\t"+type+" "+ctx.Identifier()+args+";"); 
	}

	@Override
	public void enterFieldDeclaration(FieldDeclarationContext ctx) {
		// TODO Auto-generated method stub
		super.enterFieldDeclaration(ctx);
		currentClass.addAttr();
	}
	
	public void printClassInfo(){
		System.out.println(currentClass);
	}
	
	
}
