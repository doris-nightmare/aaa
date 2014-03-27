package antlr.gencode;
// Generated from Java7.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Java7Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__88=1, T__87=2, T__86=3, T__85=4, T__84=5, T__83=6, T__82=7, T__81=8, 
		T__80=9, T__79=10, T__78=11, T__77=12, T__76=13, T__75=14, T__74=15, T__73=16, 
		T__72=17, T__71=18, T__70=19, T__69=20, T__68=21, T__67=22, T__66=23, 
		T__65=24, T__64=25, T__63=26, T__62=27, T__61=28, T__60=29, T__59=30, 
		T__58=31, T__57=32, T__56=33, T__55=34, T__54=35, T__53=36, T__52=37, 
		T__51=38, T__50=39, T__49=40, T__48=41, T__47=42, T__46=43, T__45=44, 
		T__44=45, T__43=46, T__42=47, T__41=48, T__40=49, T__39=50, T__38=51, 
		T__37=52, T__36=53, T__35=54, T__34=55, T__33=56, T__32=57, T__31=58, 
		T__30=59, T__29=60, T__28=61, T__27=62, T__26=63, T__25=64, T__24=65, 
		T__23=66, T__22=67, T__21=68, T__20=69, T__19=70, T__18=71, T__17=72, 
		T__16=73, T__15=74, T__14=75, T__13=76, T__12=77, T__11=78, T__10=79, 
		T__9=80, T__8=81, T__7=82, T__6=83, T__5=84, T__4=85, T__3=86, T__2=87, 
		T__1=88, T__0=89, HexLiteral=90, DecimalLiteral=91, OctalLiteral=92, BinaryLiteral=93, 
		FloatingPointLiteral=94, CharacterLiteral=95, StringLiteral=96, ENUM=97, 
		ASSERT=98, Identifier=99, WS=100, COMMENT=101, LINE_COMMENT=102;
	public static final String[] tokenNames = {
		"<INVALID>", "'interface'", "'&'", "'*'", "'['", "'<'", "'--'", "'false'", 
		"'continue'", "'!='", "'double'", "'abstract'", "'boolean'", "'}'", "'float'", 
		"'char'", "'strictfp'", "'case'", "'super'", "'do'", "'%'", "'*='", "')'", 
		"'throw'", "'@'", "'='", "'null'", "'throws'", "'|='", "'new'", "'class'", 
		"'finally'", "'|'", "'transient'", "'!'", "'long'", "'short'", "']'", 
		"'-='", "'public'", "'default'", "'synchronized'", "','", "'while'", "'-'", 
		"'('", "':'", "'if'", "'&='", "'int'", "'private'", "'?'", "'try'", "'void'", 
		"'package'", "'...'", "'{'", "'break'", "'native'", "'+='", "'extends'", 
		"'^='", "'final'", "'else'", "'catch'", "'true'", "'static'", "'++'", 
		"'import'", "'byte'", "'^'", "'.'", "'+'", "'protected'", "'for'", "'return'", 
		"'volatile'", "';'", "'&&'", "'this'", "'||'", "'>'", "'implements'", 
		"'%='", "'switch'", "'/='", "'/'", "'=='", "'~'", "'instanceof'", "HexLiteral", 
		"DecimalLiteral", "OctalLiteral", "BinaryLiteral", "FloatingPointLiteral", 
		"CharacterLiteral", "StringLiteral", "'enum'", "'assert'", "Identifier", 
		"WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_classOrInterfaceDeclaration = 4, RULE_classDeclaration = 5, 
		RULE_normalClassDeclaration = 6, RULE_typeParameters = 7, RULE_typeParameter = 8, 
		RULE_bound = 9, RULE_enumDeclaration = 10, RULE_enumConstants = 11, RULE_interfaceDeclaration = 12, 
		RULE_normalInterfaceDeclaration = 13, RULE_classBody = 14, RULE_interfaceBody = 15, 
		RULE_classBodyDeclaration = 16, RULE_memberDecl = 17, RULE_fieldDeclaration = 18, 
		RULE_block = 19, RULE_blockStatement = 20, RULE_enumConstant = 21, RULE_typeList = 22, 
		RULE_typeArguments = 23, RULE_typeArgument = 24, RULE_classOrArrayType = 25, 
		RULE_interfaceMemberDecl = 26, RULE_methodDeclaration = 27, RULE_constructorDeclaration = 28, 
		RULE_variableModifier = 29, RULE_interfaceMethodOrFieldDecl = 30, RULE_interfaceMethodOrFieldRest = 31, 
		RULE_interfaceMethodDeclaratorRest = 32, RULE_interfaceGenericMethodDecl = 33, 
		RULE_voidInterfaceMethodDeclaratorRest = 34, RULE_constantDeclarator = 35, 
		RULE_variableDeclarators = 36, RULE_variableDeclarator = 37, RULE_constantDeclaratorsRest = 38, 
		RULE_constantDeclaratorRest = 39, RULE_variableDeclaratorId = 40, RULE_variableInitializer = 41, 
		RULE_arrayInitializer = 42, RULE_modifier = 43, RULE_packageOrTypeName = 44, 
		RULE_enumConstantName = 45, RULE_typeName = 46, RULE_typeRef = 47, RULE_classOrInterfaceType = 48, 
		RULE_primitiveType = 49, RULE_qualifiedIdentifierList = 50, RULE_formalParameters = 51, 
		RULE_formalParameterDeclarations = 52, RULE_formalParameterVariables = 53, 
		RULE_methodBody = 54, RULE_explicitConstructorInvocation = 55, RULE_qualifiedIdentifier = 56, 
		RULE_literal = 57, RULE_integerLiteral = 58, RULE_booleanLiteral = 59, 
		RULE_annotation = 60, RULE_annotationName = 61, RULE_elementValuePairs = 62, 
		RULE_elementValuePair = 63, RULE_elementValue = 64, RULE_elementValueArrayInitializer = 65, 
		RULE_annotationTypeDeclaration = 66, RULE_annotationTypeElement = 67, 
		RULE_annotationMethod = 68, RULE_defaultValue = 69, RULE_localVariableDeclaration = 70, 
		RULE_statement = 71, RULE_tryStatement = 72, RULE_catchClause = 73, RULE_resources = 74, 
		RULE_resource = 75, RULE_switchBlock = 76, RULE_switchBlockStatementGroup = 77, 
		RULE_switchLabel = 78, RULE_forControl = 79, RULE_forInit = 80, RULE_enhancedForControl = 81, 
		RULE_forUpdate = 82, RULE_parExpression = 83, RULE_expressionList = 84, 
		RULE_statementExpression = 85, RULE_constantExpression = 86, RULE_expression = 87, 
		RULE_primary = 88, RULE_creator = 89, RULE_createdName = 90, RULE_innerCreator = 91, 
		RULE_explicitGenericInvocation = 92, RULE_arrayCreatorRest = 93, RULE_classCreatorRest = 94, 
		RULE_nonWildcardTypeArguments = 95, RULE_arguments = 96;
	public static final String[] ruleNames = {
		"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
		"classOrInterfaceDeclaration", "classDeclaration", "normalClassDeclaration", 
		"typeParameters", "typeParameter", "bound", "enumDeclaration", "enumConstants", 
		"interfaceDeclaration", "normalInterfaceDeclaration", "classBody", "interfaceBody", 
		"classBodyDeclaration", "memberDecl", "fieldDeclaration", "block", "blockStatement", 
		"enumConstant", "typeList", "typeArguments", "typeArgument", "classOrArrayType", 
		"interfaceMemberDecl", "methodDeclaration", "constructorDeclaration", 
		"variableModifier", "interfaceMethodOrFieldDecl", "interfaceMethodOrFieldRest", 
		"interfaceMethodDeclaratorRest", "interfaceGenericMethodDecl", "voidInterfaceMethodDeclaratorRest", 
		"constantDeclarator", "variableDeclarators", "variableDeclarator", "constantDeclaratorsRest", 
		"constantDeclaratorRest", "variableDeclaratorId", "variableInitializer", 
		"arrayInitializer", "modifier", "packageOrTypeName", "enumConstantName", 
		"typeName", "typeRef", "classOrInterfaceType", "primitiveType", "qualifiedIdentifierList", 
		"formalParameters", "formalParameterDeclarations", "formalParameterVariables", 
		"methodBody", "explicitConstructorInvocation", "qualifiedIdentifier", 
		"literal", "integerLiteral", "booleanLiteral", "annotation", "annotationName", 
		"elementValuePairs", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
		"annotationTypeDeclaration", "annotationTypeElement", "annotationMethod", 
		"defaultValue", "localVariableDeclaration", "statement", "tryStatement", 
		"catchClause", "resources", "resource", "switchBlock", "switchBlockStatementGroup", 
		"switchLabel", "forControl", "forInit", "enhancedForControl", "forUpdate", 
		"parExpression", "expressionList", "statementExpression", "constantExpression", 
		"expression", "primary", "creator", "createdName", "innerCreator", "explicitGenericInvocation", 
		"arrayCreatorRest", "classCreatorRest", "nonWildcardTypeArguments", "arguments"
	};

	@Override
	public String getGrammarFileName() { return "Java7.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public Java7Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public TerminalNode EOF() { return getToken(Java7Parser.EOF, 0); }
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(194); packageDeclaration();
				}
				break;
			}
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==68) {
				{
				{
				setState(197); importDeclaration();
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 11) | (1L << 16) | (1L << 24) | (1L << 30) | (1L << 33) | (1L << 39) | (1L << 41) | (1L << 50) | (1L << 58) | (1L << 62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (66 - 66)) | (1L << (73 - 66)) | (1L << (76 - 66)) | (1L << (77 - 66)) | (1L << (ENUM - 66)))) != 0)) {
				{
				{
				setState(203); typeDeclaration();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==24) {
				{
				{
				setState(211); annotation();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217); match(54);
			setState(218); qualifiedIdentifier();
			setState(219); match(77);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); match(68);
			setState(223);
			_la = _input.LA(1);
			if (_la==66) {
				{
				setState(222); match(66);
				}
			}

			setState(225); qualifiedIdentifier();
			setState(228);
			_la = _input.LA(1);
			if (_la==71) {
				{
				setState(226); match(71);
				setState(227); match(3);
				}
			}

			setState(230); match(77);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() {
			return getRuleContext(ClassOrInterfaceDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		try {
			setState(234);
			switch (_input.LA(1)) {
			case 1:
			case 11:
			case 16:
			case 24:
			case 30:
			case 33:
			case 39:
			case 41:
			case 50:
			case 58:
			case 62:
			case 66:
			case 73:
			case 76:
			case ENUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(232); classOrInterfaceDeclaration();
				}
				break;
			case 77:
				enterOuterAlt(_localctx, 2);
				{
				setState(233); match(77);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceDeclarationContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ClassOrInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterClassOrInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitClassOrInterfaceDeclaration(this);
		}
	}

	public final ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() throws RecognitionException {
		ClassOrInterfaceDeclarationContext _localctx = new ClassOrInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classOrInterfaceDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(236); modifier();
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(244);
			switch (_input.LA(1)) {
			case 30:
			case ENUM:
				{
				setState(242); classDeclaration();
				}
				break;
			case 1:
			case 24:
				{
				setState(243); interfaceDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classDeclaration);
		try {
			setState(248);
			switch (_input.LA(1)) {
			case 30:
				enterOuterAlt(_localctx, 1);
				{
				setState(246); normalClassDeclaration();
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(247); enumDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterNormalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitNormalClassDeclaration(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); match(30);
			setState(251); match(Identifier);
			setState(253);
			_la = _input.LA(1);
			if (_la==5) {
				{
				setState(252); typeParameters();
				}
			}

			setState(257);
			_la = _input.LA(1);
			if (_la==60) {
				{
				setState(255); match(60);
				setState(256); typeRef();
				}
			}

			setState(261);
			_la = _input.LA(1);
			if (_la==82) {
				{
				setState(259); match(82);
				setState(260); typeList();
				}
			}

			setState(263); classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265); match(5);
			setState(266); typeParameter();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==42) {
				{
				{
				setState(267); match(42);
				setState(268); typeParameter();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274); match(81);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public BoundContext bound() {
			return getRuleContext(BoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276); match(Identifier);
			setState(279);
			_la = _input.LA(1);
			if (_la==60) {
				{
				setState(277); match(60);
				setState(278); bound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoundContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType(int i) {
			return getRuleContext(ClassOrInterfaceTypeContext.class,i);
		}
		public List<ClassOrInterfaceTypeContext> classOrInterfaceType() {
			return getRuleContexts(ClassOrInterfaceTypeContext.class);
		}
		public BoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitBound(this);
		}
	}

	public final BoundContext bound() throws RecognitionException {
		BoundContext _localctx = new BoundContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); classOrInterfaceType();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==2) {
				{
				{
				setState(282); match(2);
				setState(283); classOrInterfaceType();
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode ENUM() { return getToken(Java7Parser.ENUM, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289); match(ENUM);
			setState(290); match(Identifier);
			setState(293);
			_la = _input.LA(1);
			if (_la==82) {
				{
				setState(291); match(82);
				setState(292); typeList();
				}
			}

			setState(295); match(56);
			setState(297);
			_la = _input.LA(1);
			if (_la==24 || _la==42 || _la==Identifier) {
				{
				setState(296); enumConstants();
				}
			}

			setState(306);
			_la = _input.LA(1);
			if (_la==77) {
				{
				setState(299); match(77);
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 5) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 24) | (1L << 30) | (1L << 33) | (1L << 35) | (1L << 36) | (1L << 39) | (1L << 41) | (1L << 49) | (1L << 50) | (1L << 53) | (1L << 56) | (1L << 58) | (1L << 62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (66 - 66)) | (1L << (69 - 66)) | (1L << (73 - 66)) | (1L << (76 - 66)) | (1L << (77 - 66)) | (1L << (ENUM - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					{
					setState(300); classBodyDeclaration();
					}
					}
					setState(305);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(308); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitEnumConstants(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumConstants);
		int _la;
		try {
			int _alt;
			setState(322);
			switch (_input.LA(1)) {
			case 24:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(310); enumConstant();
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(311); match(42);
						setState(312); enumConstant();
						}
						} 
					}
					setState(317);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(319);
				_la = _input.LA(1);
				if (_la==42) {
					{
					setState(318); match(42);
					}
				}

				}
				break;
			case 42:
				enterOuterAlt(_localctx, 2);
				{
				setState(321); match(42);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceDeclaration);
		try {
			setState(326);
			switch (_input.LA(1)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324); normalInterfaceDeclaration();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 2);
				{
				setState(325); annotationTypeDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterNormalInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitNormalInterfaceDeclaration(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328); match(1);
			setState(329); match(Identifier);
			setState(331);
			_la = _input.LA(1);
			if (_la==5) {
				{
				setState(330); typeParameters();
				}
			}

			setState(335);
			_la = _input.LA(1);
			if (_la==60) {
				{
				setState(333); match(60);
				setState(334); typeList();
				}
			}

			setState(337); interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339); match(56);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 5) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 24) | (1L << 30) | (1L << 33) | (1L << 35) | (1L << 36) | (1L << 39) | (1L << 41) | (1L << 49) | (1L << 50) | (1L << 53) | (1L << 56) | (1L << 58) | (1L << 62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (66 - 66)) | (1L << (69 - 66)) | (1L << (73 - 66)) | (1L << (76 - 66)) | (1L << (77 - 66)) | (1L << (ENUM - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				{
				setState(340); classBodyDeclaration();
				}
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(346); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public InterfaceMemberDeclContext interfaceMemberDecl(int i) {
			return getRuleContext(InterfaceMemberDeclContext.class,i);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public List<InterfaceMemberDeclContext> interfaceMemberDecl() {
			return getRuleContexts(InterfaceMemberDeclContext.class);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(348); match(56);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 5) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 24) | (1L << 30) | (1L << 33) | (1L << 35) | (1L << 36) | (1L << 39) | (1L << 41) | (1L << 49) | (1L << 50) | (1L << 53) | (1L << 58) | (1L << 62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (66 - 66)) | (1L << (69 - 66)) | (1L << (73 - 66)) | (1L << (76 - 66)) | (1L << (77 - 66)) | (1L << (ENUM - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(357);
				switch (_input.LA(1)) {
				case 1:
				case 5:
				case 10:
				case 11:
				case 12:
				case 14:
				case 15:
				case 16:
				case 24:
				case 30:
				case 33:
				case 35:
				case 36:
				case 39:
				case 41:
				case 49:
				case 50:
				case 53:
				case 58:
				case 62:
				case 66:
				case 69:
				case 73:
				case 76:
				case ENUM:
				case Identifier:
					{
					setState(352);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
					while ( _alt!=2 && _alt!=-1 ) {
						if ( _alt==1 ) {
							{
							{
							setState(349); modifier();
							}
							} 
						}
						setState(354);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
					}
					setState(355); interfaceMemberDecl();
					}
					break;
				case 77:
					{
					setState(356); match(77);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public MemberDeclContext memberDecl() {
			return getRuleContext(MemberDeclContext.class,0);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(376);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364); match(77);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(365); modifier();
						}
						} 
					}
					setState(370);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				setState(371); memberDecl();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(373);
				_la = _input.LA(1);
				if (_la==66) {
					{
					setState(372); match(66);
					}
				}

				setState(375); block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclContext extends ParserRuleContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public MemberDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterMemberDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitMemberDecl(this);
		}
	}

	public final MemberDeclContext memberDecl() throws RecognitionException {
		MemberDeclContext _localctx = new MemberDeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_memberDecl);
		try {
			setState(383);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378); methodDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379); fieldDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(380); constructorDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(381); interfaceDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(382); classDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385); typeRef();
			setState(386); variableDeclarators();
			setState(387); match(77);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389); match(56);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 23) | (1L << 24) | (1L << 26) | (1L << 29) | (1L << 30) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 39) | (1L << 41) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 47) | (1L << 49) | (1L << 50) | (1L << 52) | (1L << 53) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (66 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (73 - 65)) | (1L << (74 - 65)) | (1L << (75 - 65)) | (1L << (76 - 65)) | (1L << (77 - 65)) | (1L << (79 - 65)) | (1L << (84 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (ENUM - 65)) | (1L << (ASSERT - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				{
				setState(390); blockStatement();
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() {
			return getRuleContext(ClassOrInterfaceDeclarationContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_blockStatement);
		try {
			setState(403);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398); localVariableDeclaration();
				setState(399); match(77);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(401); classOrInterfaceDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(402); statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==24) {
				{
				{
				setState(405); annotation();
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(411); match(Identifier);
			setState(413);
			_la = _input.LA(1);
			if (_la==45) {
				{
				setState(412); arguments();
				}
			}

			setState(416);
			_la = _input.LA(1);
			if (_la==56) {
				{
				setState(415); classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType(int i) {
			return getRuleContext(ClassOrInterfaceTypeContext.class,i);
		}
		public List<ClassOrInterfaceTypeContext> classOrInterfaceType() {
			return getRuleContexts(ClassOrInterfaceTypeContext.class);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418); classOrInterfaceType();
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==42) {
				{
				{
				setState(419); match(42);
				setState(420); classOrInterfaceType();
				}
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426); match(5);
			setState(427); typeArgument();
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==42) {
				{
				{
				setState(428); match(42);
				setState(429); typeArgument();
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(435); match(81);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public ClassOrArrayTypeContext classOrArrayType() {
			return getRuleContext(ClassOrArrayTypeContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_typeArgument);
		int _la;
		try {
			setState(443);
			switch (_input.LA(1)) {
			case 10:
			case 12:
			case 14:
			case 15:
			case 35:
			case 36:
			case 49:
			case 69:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(437); classOrArrayType();
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 2);
				{
				setState(438); match(51);
				setState(441);
				_la = _input.LA(1);
				if (_la==18 || _la==60) {
					{
					setState(439);
					_la = _input.LA(1);
					if ( !(_la==18 || _la==60) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(440); classOrArrayType();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrArrayTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ClassOrArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterClassOrArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitClassOrArrayType(this);
		}
	}

	public final ClassOrArrayTypeContext classOrArrayType() throws RecognitionException {
		ClassOrArrayTypeContext _localctx = new ClassOrArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_classOrArrayType);
		int _la;
		try {
			setState(463);
			switch (_input.LA(1)) {
			case 10:
			case 12:
			case 14:
			case 15:
			case 35:
			case 36:
			case 49:
			case 69:
				enterOuterAlt(_localctx, 1);
				{
				setState(445); primitiveType();
				setState(446); match(4);
				setState(447); match(37);
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(448); match(4);
					setState(449); match(37);
					}
					}
					setState(454);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(455); classOrInterfaceType();
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(456); match(4);
					setState(457); match(37);
					}
					}
					setState(462);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclContext extends ParserRuleContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public InterfaceGenericMethodDeclContext interfaceGenericMethodDecl() {
			return getRuleContext(InterfaceGenericMethodDeclContext.class,0);
		}
		public InterfaceMethodOrFieldDeclContext interfaceMethodOrFieldDecl() {
			return getRuleContext(InterfaceMethodOrFieldDeclContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public VoidInterfaceMethodDeclaratorRestContext voidInterfaceMethodDeclaratorRest() {
			return getRuleContext(VoidInterfaceMethodDeclaratorRestContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public InterfaceMemberDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInterfaceMemberDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInterfaceMemberDecl(this);
		}
	}

	public final InterfaceMemberDeclContext interfaceMemberDecl() throws RecognitionException {
		InterfaceMemberDeclContext _localctx = new InterfaceMemberDeclContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_interfaceMemberDecl);
		try {
			setState(472);
			switch (_input.LA(1)) {
			case 10:
			case 12:
			case 14:
			case 15:
			case 35:
			case 36:
			case 49:
			case 69:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(465); interfaceMethodOrFieldDecl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 2);
				{
				setState(466); interfaceGenericMethodDecl();
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 3);
				{
				setState(467); match(53);
				setState(468); match(Identifier);
				setState(469); voidInterfaceMethodDeclaratorRest();
				}
				break;
			case 1:
			case 24:
				enterOuterAlt(_localctx, 4);
				{
				setState(470); interfaceDeclaration();
				}
				break;
			case 30:
			case ENUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(471); classDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public QualifiedIdentifierListContext qualifiedIdentifierList() {
			return getRuleContext(QualifiedIdentifierListContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			_la = _input.LA(1);
			if (_la==5) {
				{
				setState(474); typeParameters();
				}
			}

			setState(479);
			switch (_input.LA(1)) {
			case 10:
			case 12:
			case 14:
			case 15:
			case 35:
			case 36:
			case 49:
			case 69:
			case Identifier:
				{
				setState(477); typeRef();
				}
				break;
			case 53:
				{
				setState(478); match(53);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(481); match(Identifier);
			setState(482); formalParameters();
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(483); match(4);
				setState(484); match(37);
				}
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(492);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(490); match(27);
				setState(491); qualifiedIdentifierList();
				}
			}

			setState(496);
			switch (_input.LA(1)) {
			case 56:
				{
				setState(494); methodBody();
				}
				break;
			case 77:
				{
				setState(495); match(77);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public QualifiedIdentifierListContext qualifiedIdentifierList() {
			return getRuleContext(QualifiedIdentifierListContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_la = _input.LA(1);
			if (_la==5) {
				{
				setState(498); typeParameters();
				}
			}

			setState(501); match(Identifier);
			setState(502); formalParameters();
			setState(505);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(503); match(27);
				setState(504); qualifiedIdentifierList();
				}
			}

			setState(507); match(56);
			setState(509);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(508); explicitConstructorInvocation();
				}
				break;
			}
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 23) | (1L << 24) | (1L << 26) | (1L << 29) | (1L << 30) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 39) | (1L << 41) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 47) | (1L << 49) | (1L << 50) | (1L << 52) | (1L << 53) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (66 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (73 - 65)) | (1L << (74 - 65)) | (1L << (75 - 65)) | (1L << (76 - 65)) | (1L << (77 - 65)) | (1L << (79 - 65)) | (1L << (84 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (ENUM - 65)) | (1L << (ASSERT - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				{
				setState(511); blockStatement();
				}
				}
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(517); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_variableModifier);
		try {
			setState(521);
			switch (_input.LA(1)) {
			case 62:
				enterOuterAlt(_localctx, 1);
				{
				setState(519); match(62);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 2);
				{
				setState(520); annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodOrFieldDeclContext extends ParserRuleContext {
		public InterfaceMethodOrFieldRestContext interfaceMethodOrFieldRest() {
			return getRuleContext(InterfaceMethodOrFieldRestContext.class,0);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public InterfaceMethodOrFieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodOrFieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInterfaceMethodOrFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInterfaceMethodOrFieldDecl(this);
		}
	}

	public final InterfaceMethodOrFieldDeclContext interfaceMethodOrFieldDecl() throws RecognitionException {
		InterfaceMethodOrFieldDeclContext _localctx = new InterfaceMethodOrFieldDeclContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_interfaceMethodOrFieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523); typeRef();
			setState(524); match(Identifier);
			setState(525); interfaceMethodOrFieldRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodOrFieldRestContext extends ParserRuleContext {
		public InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() {
			return getRuleContext(InterfaceMethodDeclaratorRestContext.class,0);
		}
		public ConstantDeclaratorsRestContext constantDeclaratorsRest() {
			return getRuleContext(ConstantDeclaratorsRestContext.class,0);
		}
		public InterfaceMethodOrFieldRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodOrFieldRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInterfaceMethodOrFieldRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInterfaceMethodOrFieldRest(this);
		}
	}

	public final InterfaceMethodOrFieldRestContext interfaceMethodOrFieldRest() throws RecognitionException {
		InterfaceMethodOrFieldRestContext _localctx = new InterfaceMethodOrFieldRestContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_interfaceMethodOrFieldRest);
		try {
			setState(531);
			switch (_input.LA(1)) {
			case 4:
			case 25:
				enterOuterAlt(_localctx, 1);
				{
				setState(527); constantDeclaratorsRest();
				setState(528); match(77);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 2);
				{
				setState(530); interfaceMethodDeclaratorRest();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclaratorRestContext extends ParserRuleContext {
		public QualifiedIdentifierListContext qualifiedIdentifierList() {
			return getRuleContext(QualifiedIdentifierListContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public InterfaceMethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInterfaceMethodDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInterfaceMethodDeclaratorRest(this);
		}
	}

	public final InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() throws RecognitionException {
		InterfaceMethodDeclaratorRestContext _localctx = new InterfaceMethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_interfaceMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533); formalParameters();
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(534); match(4);
				setState(535); match(37);
				}
				}
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(543);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(541); match(27);
				setState(542); qualifiedIdentifierList();
				}
			}

			setState(545); match(77);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceGenericMethodDeclContext extends ParserRuleContext {
		public InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() {
			return getRuleContext(InterfaceMethodDeclaratorRestContext.class,0);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public InterfaceGenericMethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceGenericMethodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInterfaceGenericMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInterfaceGenericMethodDecl(this);
		}
	}

	public final InterfaceGenericMethodDeclContext interfaceGenericMethodDecl() throws RecognitionException {
		InterfaceGenericMethodDeclContext _localctx = new InterfaceGenericMethodDeclContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_interfaceGenericMethodDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547); typeParameters();
			setState(550);
			switch (_input.LA(1)) {
			case 10:
			case 12:
			case 14:
			case 15:
			case 35:
			case 36:
			case 49:
			case 69:
			case Identifier:
				{
				setState(548); typeRef();
				}
				break;
			case 53:
				{
				setState(549); match(53);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(552); match(Identifier);
			setState(553); interfaceMethodDeclaratorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VoidInterfaceMethodDeclaratorRestContext extends ParserRuleContext {
		public QualifiedIdentifierListContext qualifiedIdentifierList() {
			return getRuleContext(QualifiedIdentifierListContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public VoidInterfaceMethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidInterfaceMethodDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterVoidInterfaceMethodDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitVoidInterfaceMethodDeclaratorRest(this);
		}
	}

	public final VoidInterfaceMethodDeclaratorRestContext voidInterfaceMethodDeclaratorRest() throws RecognitionException {
		VoidInterfaceMethodDeclaratorRestContext _localctx = new VoidInterfaceMethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_voidInterfaceMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555); formalParameters();
			setState(558);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(556); match(27);
				setState(557); qualifiedIdentifierList();
				}
			}

			setState(560); match(77);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public ConstantDeclaratorRestContext constantDeclaratorRest() {
			return getRuleContext(ConstantDeclaratorRestContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitConstantDeclarator(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_constantDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562); match(Identifier);
			setState(563); constantDeclaratorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565); variableDeclarator();
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==42) {
				{
				{
				setState(566); match(42);
				setState(567); variableDeclarator();
				}
				}
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573); variableDeclaratorId();
			setState(576);
			_la = _input.LA(1);
			if (_la==25) {
				{
				setState(574); match(25);
				setState(575); variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorsRestContext extends ParserRuleContext {
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorRestContext constantDeclaratorRest() {
			return getRuleContext(ConstantDeclaratorRestContext.class,0);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public ConstantDeclaratorsRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaratorsRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterConstantDeclaratorsRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitConstantDeclaratorsRest(this);
		}
	}

	public final ConstantDeclaratorsRestContext constantDeclaratorsRest() throws RecognitionException {
		ConstantDeclaratorsRestContext _localctx = new ConstantDeclaratorsRestContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_constantDeclaratorsRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578); constantDeclaratorRest();
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==42) {
				{
				{
				setState(579); match(42);
				setState(580); constantDeclarator();
				}
				}
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorRestContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public ConstantDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterConstantDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitConstantDeclaratorRest(this);
		}
	}

	public final ConstantDeclaratorRestContext constantDeclaratorRest() throws RecognitionException {
		ConstantDeclaratorRestContext _localctx = new ConstantDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_constantDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(586); match(4);
				setState(587); match(37);
				}
				}
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(593); match(25);
			setState(594); variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596); match(Identifier);
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(597); match(4);
				setState(598); match(37);
				}
				}
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_variableInitializer);
		try {
			setState(606);
			switch (_input.LA(1)) {
			case 56:
				enterOuterAlt(_localctx, 1);
				{
				setState(604); arrayInitializer();
				}
				break;
			case 6:
			case 7:
			case 10:
			case 12:
			case 14:
			case 15:
			case 18:
			case 26:
			case 29:
			case 34:
			case 35:
			case 36:
			case 44:
			case 45:
			case 49:
			case 53:
			case 65:
			case 67:
			case 69:
			case 72:
			case 79:
			case 88:
			case HexLiteral:
			case DecimalLiteral:
			case OctalLiteral:
			case BinaryLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(605); expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(608); match(56);
			setState(620);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53) | (1L << 56))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(609); variableInitializer();
				setState(614);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(610); match(42);
						setState(611); variableInitializer();
						}
						} 
					}
					setState(616);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				setState(618);
				_la = _input.LA(1);
				if (_la==42) {
					{
					setState(617); match(42);
					}
				}

				}
			}

			setState(622); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_modifier);
		try {
			setState(636);
			switch (_input.LA(1)) {
			case 24:
				enterOuterAlt(_localctx, 1);
				{
				setState(624); annotation();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 2);
				{
				setState(625); match(39);
				}
				break;
			case 73:
				enterOuterAlt(_localctx, 3);
				{
				setState(626); match(73);
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 4);
				{
				setState(627); match(50);
				}
				break;
			case 66:
				enterOuterAlt(_localctx, 5);
				{
				setState(628); match(66);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 6);
				{
				setState(629); match(11);
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 7);
				{
				setState(630); match(62);
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 8);
				{
				setState(631); match(58);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 9);
				{
				setState(632); match(41);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 10);
				{
				setState(633); match(33);
				}
				break;
			case 76:
				enterOuterAlt(_localctx, 11);
				{
				setState(634); match(76);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 12);
				{
				setState(635); match(16);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterPackageOrTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitPackageOrTypeName(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_packageOrTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638); qualifiedIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitEnumConstantName(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642); qualifiedIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeRefContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeRef(this);
		}
	}

	public final TypeRefContext typeRef() throws RecognitionException {
		TypeRefContext _localctx = new TypeRefContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_typeRef);
		try {
			int _alt;
			setState(660);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(644); classOrInterfaceType();
				setState(649);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(645); match(4);
						setState(646); match(37);
						}
						} 
					}
					setState(651);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
				}
				break;
			case 10:
			case 12:
			case 14:
			case 15:
			case 35:
			case 36:
			case 49:
			case 69:
				enterOuterAlt(_localctx, 2);
				{
				setState(652); primitiveType();
				setState(657);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(653); match(4);
						setState(654); match(37);
						}
						} 
					}
					setState(659);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(662); match(Identifier);
			setState(664);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(663); typeArguments();
				}
				break;
			}
			setState(673);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(666); match(71);
					setState(667); match(Identifier);
					setState(669);
					switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
					case 1:
						{
						setState(668); typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(675);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			_la = _input.LA(1);
			if ( !(((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (10 - 10)) | (1L << (12 - 10)) | (1L << (14 - 10)) | (1L << (15 - 10)) | (1L << (35 - 10)) | (1L << (36 - 10)) | (1L << (49 - 10)) | (1L << (69 - 10)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedIdentifierListContext extends ParserRuleContext {
		public QualifiedIdentifierContext qualifiedIdentifier(int i) {
			return getRuleContext(QualifiedIdentifierContext.class,i);
		}
		public List<QualifiedIdentifierContext> qualifiedIdentifier() {
			return getRuleContexts(QualifiedIdentifierContext.class);
		}
		public QualifiedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterQualifiedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitQualifiedIdentifierList(this);
		}
	}

	public final QualifiedIdentifierListContext qualifiedIdentifierList() throws RecognitionException {
		QualifiedIdentifierListContext _localctx = new QualifiedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_qualifiedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678); qualifiedIdentifier();
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==42) {
				{
				{
				setState(679); match(42);
				setState(680); qualifiedIdentifier();
				}
				}
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterDeclarationsContext formalParameterDeclarations() {
			return getRuleContext(FormalParameterDeclarationsContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686); match(45);
			setState(688);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 24) | (1L << 35) | (1L << 36) | (1L << 49) | (1L << 62))) != 0) || _la==69 || _la==Identifier) {
				{
				setState(687); formalParameterDeclarations();
				}
			}

			setState(690); match(22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterDeclarationsContext extends ParserRuleContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public FormalParameterVariablesContext formalParameterVariables() {
			return getRuleContext(FormalParameterVariablesContext.class,0);
		}
		public FormalParameterDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterFormalParameterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitFormalParameterDeclarations(this);
		}
	}

	public final FormalParameterDeclarationsContext formalParameterDeclarations() throws RecognitionException {
		FormalParameterDeclarationsContext _localctx = new FormalParameterDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_formalParameterDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==24 || _la==62) {
				{
				{
				setState(692); variableModifier();
				}
				}
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(698); typeRef();
			setState(699); formalParameterVariables();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterVariablesContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterDeclarationsContext formalParameterDeclarations() {
			return getRuleContext(FormalParameterDeclarationsContext.class,0);
		}
		public FormalParameterVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterFormalParameterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitFormalParameterVariables(this);
		}
	}

	public final FormalParameterVariablesContext formalParameterVariables() throws RecognitionException {
		FormalParameterVariablesContext _localctx = new FormalParameterVariablesContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_formalParameterVariables);
		int _la;
		try {
			setState(708);
			switch (_input.LA(1)) {
			case 55:
				enterOuterAlt(_localctx, 1);
				{
				setState(701); match(55);
				setState(702); variableDeclaratorId();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(703); variableDeclaratorId();
				setState(706);
				_la = _input.LA(1);
				if (_la==42) {
					{
					setState(704); match(42);
					setState(705); formalParameterDeclarations();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterExplicitConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitExplicitConstructorInvocation(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(728);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(713);
				_la = _input.LA(1);
				if (_la==5) {
					{
					setState(712); nonWildcardTypeArguments();
					}
				}

				setState(715);
				_la = _input.LA(1);
				if ( !(_la==18 || _la==79) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(716); arguments();
				setState(717); match(77);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(719); primary();
				setState(720); match(71);
				setState(722);
				_la = _input.LA(1);
				if (_la==5) {
					{
					setState(721); nonWildcardTypeArguments();
					}
				}

				setState(724); match(18);
				setState(725); arguments();
				setState(726); match(77);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedIdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public QualifiedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterQualifiedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitQualifiedIdentifier(this);
		}
	}

	public final QualifiedIdentifierContext qualifiedIdentifier() throws RecognitionException {
		QualifiedIdentifierContext _localctx = new QualifiedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_qualifiedIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(730); match(Identifier);
			setState(735);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(731); match(71);
					setState(732); match(Identifier);
					}
					} 
				}
				setState(737);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(Java7Parser.StringLiteral, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode CharacterLiteral() { return getToken(Java7Parser.CharacterLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(Java7Parser.FloatingPointLiteral, 0); }
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_literal);
		try {
			setState(744);
			switch (_input.LA(1)) {
			case HexLiteral:
			case DecimalLiteral:
			case OctalLiteral:
			case BinaryLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(738); integerLiteral();
				}
				break;
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(739); match(FloatingPointLiteral);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(740); match(CharacterLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(741); match(StringLiteral);
				}
				break;
			case 7:
			case 65:
				enterOuterAlt(_localctx, 5);
				{
				setState(742); booleanLiteral();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 6);
				{
				setState(743); match(26);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode HexLiteral() { return getToken(Java7Parser.HexLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(Java7Parser.DecimalLiteral, 0); }
		public TerminalNode OctalLiteral() { return getToken(Java7Parser.OctalLiteral, 0); }
		public TerminalNode BinaryLiteral() { return getToken(Java7Parser.BinaryLiteral, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitIntegerLiteral(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (HexLiteral - 90)) | (1L << (DecimalLiteral - 90)) | (1L << (OctalLiteral - 90)) | (1L << (BinaryLiteral - 90)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitBooleanLiteral(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			_la = _input.LA(1);
			if ( !(_la==7 || _la==65) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750); match(24);
			setState(751); annotationName();
			setState(758);
			_la = _input.LA(1);
			if (_la==45) {
				{
				setState(752); match(45);
				setState(755);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(753); elementValuePairs();
					}
					break;

				case 2:
					{
					setState(754); elementValue();
					}
					break;
				}
				setState(757); match(22);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationNameContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitAnnotationName(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_annotationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760); match(Identifier);
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==71) {
				{
				{
				setState(761); match(71);
				setState(762); match(Identifier);
				}
				}
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairsContext extends ParserRuleContext {
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitElementValuePairs(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768); elementValuePair();
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==42) {
				{
				{
				setState(769); match(42);
				setState(770); elementValuePair();
				}
				}
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776); match(Identifier);
			setState(777); match(25);
			setState(778); elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_elementValue);
		try {
			setState(783);
			switch (_input.LA(1)) {
			case 6:
			case 7:
			case 10:
			case 12:
			case 14:
			case 15:
			case 18:
			case 26:
			case 29:
			case 34:
			case 35:
			case 36:
			case 44:
			case 45:
			case 49:
			case 53:
			case 65:
			case 67:
			case 69:
			case 72:
			case 79:
			case 88:
			case HexLiteral:
			case DecimalLiteral:
			case OctalLiteral:
			case BinaryLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(780); expression(0);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 2);
				{
				setState(781); annotation();
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 3);
				{
				setState(782); elementValueArrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(785); match(56);
			setState(794);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 24) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53) | (1L << 56))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(786); elementValue();
				setState(791);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(787); match(42);
						setState(788); elementValue();
						}
						} 
					}
					setState(793);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				}
				}
			}

			setState(797);
			_la = _input.LA(1);
			if (_la==42) {
				{
				setState(796); match(42);
				}
			}

			setState(799); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public List<AnnotationTypeElementContext> annotationTypeElement() {
			return getRuleContexts(AnnotationTypeElementContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public AnnotationTypeElementContext annotationTypeElement(int i) {
			return getRuleContext(AnnotationTypeElementContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_annotationTypeDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(801); match(24);
			setState(802); match(1);
			setState(803); match(Identifier);
			setState(804); match(56);
			setState(814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 24) | (1L << 30) | (1L << 33) | (1L << 35) | (1L << 36) | (1L << 39) | (1L << 41) | (1L << 49) | (1L << 50) | (1L << 58) | (1L << 62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (66 - 66)) | (1L << (69 - 66)) | (1L << (73 - 66)) | (1L << (76 - 66)) | (1L << (ENUM - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				{
				setState(808);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(805); modifier();
						}
						} 
					}
					setState(810);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				}
				setState(811); annotationTypeElement();
				}
				}
				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(817); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementContext extends ParserRuleContext {
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationMethodContext annotationMethod() {
			return getRuleContext(AnnotationMethodContext.class,0);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationTypeElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterAnnotationTypeElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitAnnotationTypeElement(this);
		}
	}

	public final AnnotationTypeElementContext annotationTypeElement() throws RecognitionException {
		AnnotationTypeElementContext _localctx = new AnnotationTypeElementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_annotationTypeElement);
		int _la;
		try {
			setState(842);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(819); typeRef();
				setState(822);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(820); annotationMethod();
					}
					break;

				case 2:
					{
					setState(821); variableDeclarators();
					}
					break;
				}
				setState(824); match(77);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(826); classDeclaration();
				setState(828);
				_la = _input.LA(1);
				if (_la==77) {
					{
					setState(827); match(77);
					}
				}

				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(830); normalInterfaceDeclaration();
				setState(832);
				_la = _input.LA(1);
				if (_la==77) {
					{
					setState(831); match(77);
					}
				}

				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(834); enumDeclaration();
				setState(836);
				_la = _input.LA(1);
				if (_la==77) {
					{
					setState(835); match(77);
					}
				}

				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(838); annotationTypeDeclaration();
				setState(840);
				_la = _input.LA(1);
				if (_la==77) {
					{
					setState(839); match(77);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodContext extends ParserRuleContext {
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public AnnotationMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterAnnotationMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitAnnotationMethod(this);
		}
	}

	public final AnnotationMethodContext annotationMethod() throws RecognitionException {
		AnnotationMethodContext _localctx = new AnnotationMethodContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_annotationMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844); match(Identifier);
			setState(845); match(45);
			setState(846); match(22);
			setState(848);
			_la = _input.LA(1);
			if (_la==40) {
				{
				setState(847); defaultValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850); match(40);
			setState(851); elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==24 || _la==62) {
				{
				{
				setState(853); variableModifier();
				}
				}
				setState(858);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(859); typeRef();
			setState(860); variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(Java7Parser.ASSERT, 0); }
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_statement);
		int _la;
		try {
			setState(929);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(862); block();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(863); match(ASSERT);
				setState(864); expression(0);
				setState(867);
				_la = _input.LA(1);
				if (_la==46) {
					{
					setState(865); match(46);
					setState(866); expression(0);
					}
				}

				setState(869); match(77);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(871); match(47);
				setState(872); parExpression();
				setState(873); statement();
				setState(876);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(874); match(63);
					setState(875); statement();
					}
					break;
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(878); match(74);
				setState(879); match(45);
				setState(880); forControl();
				setState(881); match(22);
				setState(882); statement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(884); match(43);
				setState(885); parExpression();
				setState(886); statement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(888); match(19);
				setState(889); statement();
				setState(890); match(43);
				setState(891); parExpression();
				setState(892); match(77);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(894); tryStatement();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(895); match(84);
				setState(896); parExpression();
				setState(897); switchBlock();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(899); match(41);
				setState(900); parExpression();
				setState(901); block();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(903); match(75);
				setState(905);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(904); expression(0);
					}
				}

				setState(907); match(77);
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(908); match(23);
				setState(909); expression(0);
				setState(910); match(77);
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(912); match(57);
				setState(914);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(913); match(Identifier);
					}
				}

				setState(916); match(77);
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(917); match(8);
				setState(919);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(918); match(Identifier);
					}
				}

				setState(921); match(77);
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(922); match(77);
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(923); statementExpression();
				setState(924); match(77);
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(926); match(Identifier);
				setState(927); match(46);
				setState(928); statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTryStatement(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_tryStatement);
		int _la;
		try {
			setState(961);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(931); match(52);
				setState(932); match(45);
				setState(933); resources();
				setState(934); match(22);
				setState(935); block();
				setState(939);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==64) {
					{
					{
					setState(936); catchClause();
					}
					}
					setState(941);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(944);
				_la = _input.LA(1);
				if (_la==31) {
					{
					setState(942); match(31);
					setState(943); block();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(946); match(52);
				setState(947); block();
				setState(959);
				switch (_input.LA(1)) {
				case 64:
					{
					setState(949); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(948); catchClause();
						}
						}
						setState(951); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==64 );
					setState(955);
					_la = _input.LA(1);
					if (_la==31) {
						{
						setState(953); match(31);
						setState(954); block();
						}
					}

					}
					break;
				case 31:
					{
					setState(957); match(31);
					setState(958); block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public List<TypeNameContext> typeName() {
			return getRuleContexts(TypeNameContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeNameContext typeName(int i) {
			return getRuleContext(TypeNameContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963); match(64);
			setState(964); match(45);
			setState(968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==24 || _la==62) {
				{
				{
				setState(965); variableModifier();
				}
				}
				setState(970);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(971); typeName();
			setState(976);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==32) {
				{
				{
				setState(972); match(32);
				setState(973); typeName();
				}
				}
				setState(978);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(979); match(Identifier);
			setState(980); match(22);
			setState(981); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourcesContext extends ParserRuleContext {
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitResources(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_resources);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(983); resource();
			setState(988);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(984); match(77);
					setState(985); resource();
					}
					} 
				}
				setState(990);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			setState(992);
			_la = _input.LA(1);
			if (_la==77) {
				{
				setState(991); match(77);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==24 || _la==62) {
				{
				{
				setState(994); variableModifier();
				}
				}
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1000); classOrInterfaceType();
			setState(1001); variableDeclaratorId();
			setState(1002); match(25);
			setState(1003); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockContext extends ParserRuleContext {
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitSwitchBlock(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1005); match(56);
			setState(1009);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1006); switchBlockStatementGroup();
					}
					} 
				}
				setState(1011);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			}
			setState(1015);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==17 || _la==40) {
				{
				{
				setState(1012); switchLabel();
				}
				}
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1018); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_switchBlockStatementGroup);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1021); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1020); switchLabel();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1023); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(1028);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 23) | (1L << 24) | (1L << 26) | (1L << 29) | (1L << 30) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 39) | (1L << 41) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 47) | (1L << 49) | (1L << 50) | (1L << 52) | (1L << 53) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (66 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (73 - 65)) | (1L << (74 - 65)) | (1L << (75 - 65)) | (1L << (76 - 65)) | (1L << (77 - 65)) | (1L << (79 - 65)) | (1L << (84 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (ENUM - 65)) | (1L << (ASSERT - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				{
				setState(1025); blockStatement();
				}
				}
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_switchLabel);
		try {
			setState(1041);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1031); match(17);
				setState(1032); constantExpression();
				setState(1033); match(46);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1035); match(17);
				setState(1036); enumConstantName();
				setState(1037); match(46);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1039); match(40);
				setState(1040); match(46);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_forControl);
		int _la;
		try {
			setState(1055);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1043); enhancedForControl();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1045);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 24) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53) | (1L << 62))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(1044); forInit();
					}
				}

				setState(1047); match(77);
				setState(1049);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(1048); expression(0);
					}
				}

				setState(1051); match(77);
				setState(1053);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(1052); forUpdate();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_forInit);
		try {
			setState(1059);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1057); localVariableDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1058); expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForControlContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitEnhancedForControl(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==24 || _la==62) {
				{
				{
				setState(1061); variableModifier();
				}
				}
				setState(1066);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1067); typeRef();
			setState(1068); match(Identifier);
			setState(1069); match(46);
			setState(1070); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072); expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074); match(45);
			setState(1075); expression(0);
			setState(1076); match(22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078); expression(0);
			setState(1083);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==42) {
				{
				{
				setState(1079); match(42);
				setState(1080); expression(0);
				}
				}
				setState(1085);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1086); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 174;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1091);
				_la = _input.LA(1);
				if ( !(_la==6 || _la==44 || _la==67 || _la==72) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1092); expression(17);
				}
				break;

			case 2:
				{
				setState(1093);
				_la = _input.LA(1);
				if ( !(_la==34 || _la==88) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1094); expression(16);
				}
				break;

			case 3:
				{
				setState(1095); match(45);
				setState(1096); typeRef();
				setState(1097); match(22);
				setState(1098); expression(15);
				}
				break;

			case 4:
				{
				setState(1100); primary();
				}
				break;

			case 5:
				{
				setState(1101); match(29);
				setState(1102); creator();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1229);
					switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1105);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(1106);
						_la = _input.LA(1);
						if ( !(_la==3 || _la==20 || _la==86) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1107); expression(14);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1108);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(1109);
						_la = _input.LA(1);
						if ( !(_la==44 || _la==72) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1110); expression(13);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1111);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(1119);
						switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
						case 1:
							{
							setState(1112); match(5);
							setState(1113); match(5);
							}
							break;

						case 2:
							{
							setState(1114); match(81);
							setState(1115); match(81);
							setState(1116); match(81);
							}
							break;

						case 3:
							{
							setState(1117); match(81);
							setState(1118); match(81);
							}
							break;
						}
						setState(1121); expression(12);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1122);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(1129);
						switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
						case 1:
							{
							setState(1123); match(5);
							setState(1124); match(25);
							}
							break;

						case 2:
							{
							setState(1125); match(81);
							setState(1126); match(25);
							}
							break;

						case 3:
							{
							setState(1127); match(81);
							}
							break;

						case 4:
							{
							setState(1128); match(5);
							}
							break;
						}
						setState(1131); expression(11);
						}
						break;

					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1132);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(1133);
						_la = _input.LA(1);
						if ( !(_la==9 || _la==87) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1134); expression(9);
						}
						break;

					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1135);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(1136); match(2);
						setState(1137); expression(8);
						}
						break;

					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1138);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(1139); match(70);
						setState(1140); expression(7);
						}
						break;

					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1141);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(1142); match(32);
						setState(1143); expression(6);
						}
						break;

					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1144);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(1145); match(78);
						setState(1146); expression(5);
						}
						break;

					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1147);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(1148); match(80);
						setState(1149); expression(4);
						}
						break;

					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1150);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(1170);
						switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
						case 1:
							{
							setState(1151); match(61);
							}
							break;

						case 2:
							{
							setState(1152); match(59);
							}
							break;

						case 3:
							{
							setState(1153); match(38);
							}
							break;

						case 4:
							{
							setState(1154); match(21);
							}
							break;

						case 5:
							{
							setState(1155); match(85);
							}
							break;

						case 6:
							{
							setState(1156); match(48);
							}
							break;

						case 7:
							{
							setState(1157); match(28);
							}
							break;

						case 8:
							{
							setState(1158); match(25);
							}
							break;

						case 9:
							{
							setState(1159); match(81);
							setState(1160); match(81);
							setState(1161); match(25);
							}
							break;

						case 10:
							{
							setState(1162); match(81);
							setState(1163); match(81);
							setState(1164); match(81);
							setState(1165); match(25);
							}
							break;

						case 11:
							{
							setState(1166); match(5);
							setState(1167); match(5);
							setState(1168); match(25);
							}
							break;

						case 12:
							{
							setState(1169); match(83);
							}
							break;
						}
						setState(1172); expression(1);
						}
						break;

					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1173);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(1174); match(51);
						setState(1175); expression(0);
						setState(1176); match(46);
						setState(1177); expression(3);
						}
						break;

					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1179);
						if (!(26 >= _localctx._p)) throw new FailedPredicateException(this, "26 >= $_p");
						setState(1180); match(71);
						setState(1181); match(Identifier);
						}
						break;

					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1182);
						if (!(25 >= _localctx._p)) throw new FailedPredicateException(this, "25 >= $_p");
						setState(1183); match(71);
						setState(1184); match(79);
						}
						break;

					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1185);
						if (!(24 >= _localctx._p)) throw new FailedPredicateException(this, "24 >= $_p");
						setState(1186); match(71);
						setState(1187); match(18);
						setState(1188); match(45);
						setState(1190);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
							{
							setState(1189); expressionList();
							}
						}

						setState(1192); match(22);
						}
						break;

					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1193);
						if (!(23 >= _localctx._p)) throw new FailedPredicateException(this, "23 >= $_p");
						setState(1194); match(71);
						setState(1195); match(29);
						setState(1196); match(Identifier);
						setState(1197); match(45);
						setState(1199);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
							{
							setState(1198); expressionList();
							}
						}

						setState(1201); match(22);
						}
						break;

					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1202);
						if (!(22 >= _localctx._p)) throw new FailedPredicateException(this, "22 >= $_p");
						setState(1203); match(71);
						setState(1204); match(18);
						setState(1205); match(71);
						setState(1206); match(Identifier);
						setState(1208);
						switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
						case 1:
							{
							setState(1207); arguments();
							}
							break;
						}
						}
						break;

					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1210);
						if (!(21 >= _localctx._p)) throw new FailedPredicateException(this, "21 >= $_p");
						setState(1211); match(71);
						setState(1212); explicitGenericInvocation();
						}
						break;

					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1213);
						if (!(20 >= _localctx._p)) throw new FailedPredicateException(this, "20 >= $_p");
						setState(1214); match(4);
						setState(1215); expression(0);
						setState(1216); match(37);
						}
						break;

					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1218);
						if (!(19 >= _localctx._p)) throw new FailedPredicateException(this, "19 >= $_p");
						setState(1219); match(45);
						setState(1221);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
							{
							setState(1220); expressionList();
							}
						}

						setState(1223); match(22);
						}
						break;

					case 21:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1224);
						if (!(18 >= _localctx._p)) throw new FailedPredicateException(this, "18 >= $_p");
						setState(1225);
						_la = _input.LA(1);
						if ( !(_la==6 || _la==67) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;

					case 22:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1226);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(1227); match(89);
						setState(1228); typeRef();
						}
						break;
					}
					} 
				}
				setState(1233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_primary);
		try {
			setState(1249);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1234); match(45);
				setState(1235); expression(0);
				setState(1236); match(22);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1238); match(79);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1239); match(18);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1240); literal();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1241); match(Identifier);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1242); typeRef();
				setState(1243); match(71);
				setState(1244); match(30);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1246); match(53);
				setState(1247); match(71);
				setState(1248); match(30);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitCreator(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_creator);
		try {
			setState(1260);
			switch (_input.LA(1)) {
			case 5:
				enterOuterAlt(_localctx, 1);
				{
				setState(1251); nonWildcardTypeArguments();
				setState(1252); createdName();
				setState(1253); classCreatorRest();
				}
				break;
			case 10:
			case 12:
			case 14:
			case 15:
			case 35:
			case 36:
			case 49:
			case 69:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1255); createdName();
				setState(1258);
				switch (_input.LA(1)) {
				case 4:
					{
					setState(1256); arrayCreatorRest();
					}
					break;
				case 45:
					{
					setState(1257); classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatedNameContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitCreatedName(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_createdName);
		int _la;
		try {
			setState(1281);
			switch (_input.LA(1)) {
			case 10:
			case 12:
			case 14:
			case 15:
			case 35:
			case 36:
			case 49:
			case 69:
				enterOuterAlt(_localctx, 1);
				{
				setState(1262); primitiveType();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1263); match(Identifier);
				setState(1267);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1264); typeArguments();
					}
					break;

				case 2:
					{
					setState(1265); match(5);
					setState(1266); match(81);
					}
					break;
				}
				setState(1278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==71) {
					{
					{
					setState(1269); match(71);
					setState(1270); match(Identifier);
					setState(1274);
					switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
					case 1:
						{
						setState(1271); typeArguments();
						}
						break;

					case 2:
						{
						setState(1272); match(5);
						setState(1273); match(81);
						}
						break;
					}
					}
					}
					setState(1280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerCreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInnerCreator(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_innerCreator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				setState(1283); nonWildcardTypeArguments();
				}
				break;

			case 2:
				{
				setState(1284); match(5);
				setState(1285); match(81);
				}
				break;
			}
			setState(1288); match(Identifier);
			setState(1289); classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitExplicitGenericInvocation(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1291); nonWildcardTypeArguments();
			setState(1292); match(Identifier);
			setState(1293); arguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitArrayCreatorRest(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			setState(1324);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1295); match(4);
				setState(1296); match(37);
				setState(1301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(1297); match(4);
					setState(1298); match(37);
					}
					}
					setState(1303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1304); arrayInitializer();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1305); match(4);
				setState(1306); expression(0);
				setState(1307); match(37);
				setState(1314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1308); match(4);
						setState(1309); expression(0);
						setState(1310); match(37);
						}
						} 
					}
					setState(1316);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
				}
				setState(1321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(1317); match(4);
						setState(1318); match(37);
						}
						} 
					}
					setState(1323);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitClassCreatorRest(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326); arguments();
			setState(1328);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1327); classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitNonWildcardTypeArguments(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330); match(5);
			setState(1331); typeList();
			setState(1332); match(81);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334); match(45);
			setState(1336);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 26) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 44) | (1L << 45) | (1L << 49) | (1L << 53))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (67 - 65)) | (1L << (69 - 65)) | (1L << (72 - 65)) | (1L << (79 - 65)) | (1L << (88 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(1335); expressionList();
				}
			}

			setState(1338); match(22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 87: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 13 >= _localctx._p;

		case 1: return 12 >= _localctx._p;

		case 2: return 11 >= _localctx._p;

		case 3: return 10 >= _localctx._p;

		case 4: return 8 >= _localctx._p;

		case 5: return 7 >= _localctx._p;

		case 6: return 6 >= _localctx._p;

		case 7: return 5 >= _localctx._p;

		case 8: return 4 >= _localctx._p;

		case 9: return 3 >= _localctx._p;

		case 10: return 1 >= _localctx._p;

		case 11: return 2 >= _localctx._p;

		case 12: return 26 >= _localctx._p;

		case 13: return 25 >= _localctx._p;

		case 14: return 24 >= _localctx._p;

		case 15: return 23 >= _localctx._p;

		case 17: return 21 >= _localctx._p;

		case 16: return 22 >= _localctx._p;

		case 19: return 19 >= _localctx._p;

		case 18: return 20 >= _localctx._p;

		case 21: return 9 >= _localctx._p;

		case 20: return 18 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3h\u053f\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4"+
		")\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62"+
		"\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4"+
		";\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\t"+
		"F\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4"+
		"R\tR\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]"+
		"\t]\4^\t^\4_\t_\4`\t`\4a\ta\4b\tb\3\2\5\2\u00c6\n\2\3\2\7\2\u00c9\n\2"+
		"\f\2\16\2\u00cc\13\2\3\2\7\2\u00cf\n\2\f\2\16\2\u00d2\13\2\3\2\3\2\3\3"+
		"\7\3\u00d7\n\3\f\3\16\3\u00da\13\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4\u00e2\n"+
		"\4\3\4\3\4\3\4\5\4\u00e7\n\4\3\4\3\4\3\5\3\5\5\5\u00ed\n\5\3\6\7\6\u00f0"+
		"\n\6\f\6\16\6\u00f3\13\6\3\6\3\6\5\6\u00f7\n\6\3\7\3\7\5\7\u00fb\n\7\3"+
		"\b\3\b\3\b\5\b\u0100\n\b\3\b\3\b\5\b\u0104\n\b\3\b\3\b\5\b\u0108\n\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\7\t\u0110\n\t\f\t\16\t\u0113\13\t\3\t\3\t\3\n\3"+
		"\n\3\n\5\n\u011a\n\n\3\13\3\13\3\13\7\13\u011f\n\13\f\13\16\13\u0122\13"+
		"\13\3\f\3\f\3\f\3\f\5\f\u0128\n\f\3\f\3\f\5\f\u012c\n\f\3\f\3\f\7\f\u0130"+
		"\n\f\f\f\16\f\u0133\13\f\5\f\u0135\n\f\3\f\3\f\3\r\3\r\3\r\7\r\u013c\n"+
		"\r\f\r\16\r\u013f\13\r\3\r\5\r\u0142\n\r\3\r\5\r\u0145\n\r\3\16\3\16\5"+
		"\16\u0149\n\16\3\17\3\17\3\17\5\17\u014e\n\17\3\17\3\17\5\17\u0152\n\17"+
		"\3\17\3\17\3\20\3\20\7\20\u0158\n\20\f\20\16\20\u015b\13\20\3\20\3\20"+
		"\3\21\3\21\7\21\u0161\n\21\f\21\16\21\u0164\13\21\3\21\3\21\7\21\u0168"+
		"\n\21\f\21\16\21\u016b\13\21\3\21\3\21\3\22\3\22\7\22\u0171\n\22\f\22"+
		"\16\22\u0174\13\22\3\22\3\22\5\22\u0178\n\22\3\22\5\22\u017b\n\22\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u0182\n\23\3\24\3\24\3\24\3\24\3\25\3\25\7\25"+
		"\u018a\n\25\f\25\16\25\u018d\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u0196\n\26\3\27\7\27\u0199\n\27\f\27\16\27\u019c\13\27\3\27\3\27"+
		"\5\27\u01a0\n\27\3\27\5\27\u01a3\n\27\3\30\3\30\3\30\7\30\u01a8\n\30\f"+
		"\30\16\30\u01ab\13\30\3\31\3\31\3\31\3\31\7\31\u01b1\n\31\f\31\16\31\u01b4"+
		"\13\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u01bc\n\32\5\32\u01be\n\32\3"+
		"\33\3\33\3\33\3\33\3\33\7\33\u01c5\n\33\f\33\16\33\u01c8\13\33\3\33\3"+
		"\33\3\33\7\33\u01cd\n\33\f\33\16\33\u01d0\13\33\5\33\u01d2\n\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\5\34\u01db\n\34\3\35\5\35\u01de\n\35\3\35"+
		"\3\35\5\35\u01e2\n\35\3\35\3\35\3\35\3\35\7\35\u01e8\n\35\f\35\16\35\u01eb"+
		"\13\35\3\35\3\35\5\35\u01ef\n\35\3\35\3\35\5\35\u01f3\n\35\3\36\5\36\u01f6"+
		"\n\36\3\36\3\36\3\36\3\36\5\36\u01fc\n\36\3\36\3\36\5\36\u0200\n\36\3"+
		"\36\7\36\u0203\n\36\f\36\16\36\u0206\13\36\3\36\3\36\3\37\3\37\5\37\u020c"+
		"\n\37\3 \3 \3 \3 \3!\3!\3!\3!\5!\u0216\n!\3\"\3\"\3\"\7\"\u021b\n\"\f"+
		"\"\16\"\u021e\13\"\3\"\3\"\5\"\u0222\n\"\3\"\3\"\3#\3#\3#\5#\u0229\n#"+
		"\3#\3#\3#\3$\3$\3$\5$\u0231\n$\3$\3$\3%\3%\3%\3&\3&\3&\7&\u023b\n&\f&"+
		"\16&\u023e\13&\3\'\3\'\3\'\5\'\u0243\n\'\3(\3(\3(\7(\u0248\n(\f(\16(\u024b"+
		"\13(\3)\3)\7)\u024f\n)\f)\16)\u0252\13)\3)\3)\3)\3*\3*\3*\7*\u025a\n*"+
		"\f*\16*\u025d\13*\3+\3+\5+\u0261\n+\3,\3,\3,\3,\7,\u0267\n,\f,\16,\u026a"+
		"\13,\3,\5,\u026d\n,\5,\u026f\n,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\5-\u027f\n-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\7\61\u028a\n\61"+
		"\f\61\16\61\u028d\13\61\3\61\3\61\3\61\7\61\u0292\n\61\f\61\16\61\u0295"+
		"\13\61\5\61\u0297\n\61\3\62\3\62\5\62\u029b\n\62\3\62\3\62\3\62\5\62\u02a0"+
		"\n\62\7\62\u02a2\n\62\f\62\16\62\u02a5\13\62\3\63\3\63\3\64\3\64\3\64"+
		"\7\64\u02ac\n\64\f\64\16\64\u02af\13\64\3\65\3\65\5\65\u02b3\n\65\3\65"+
		"\3\65\3\66\7\66\u02b8\n\66\f\66\16\66\u02bb\13\66\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\3\67\3\67\5\67\u02c5\n\67\5\67\u02c7\n\67\38\38\39\59\u02cc"+
		"\n9\39\39\39\39\39\39\39\59\u02d5\n9\39\39\39\39\59\u02db\n9\3:\3:\3:"+
		"\7:\u02e0\n:\f:\16:\u02e3\13:\3;\3;\3;\3;\3;\3;\5;\u02eb\n;\3<\3<\3=\3"+
		"=\3>\3>\3>\3>\3>\5>\u02f6\n>\3>\5>\u02f9\n>\3?\3?\3?\7?\u02fe\n?\f?\16"+
		"?\u0301\13?\3@\3@\3@\7@\u0306\n@\f@\16@\u0309\13@\3A\3A\3A\3A\3B\3B\3"+
		"B\5B\u0312\nB\3C\3C\3C\3C\7C\u0318\nC\fC\16C\u031b\13C\5C\u031d\nC\3C"+
		"\5C\u0320\nC\3C\3C\3D\3D\3D\3D\3D\7D\u0329\nD\fD\16D\u032c\13D\3D\7D\u032f"+
		"\nD\fD\16D\u0332\13D\3D\3D\3E\3E\3E\5E\u0339\nE\3E\3E\3E\3E\5E\u033f\n"+
		"E\3E\3E\5E\u0343\nE\3E\3E\5E\u0347\nE\3E\3E\5E\u034b\nE\5E\u034d\nE\3"+
		"F\3F\3F\3F\5F\u0353\nF\3G\3G\3G\3H\7H\u0359\nH\fH\16H\u035c\13H\3H\3H"+
		"\3H\3I\3I\3I\3I\3I\5I\u0366\nI\3I\3I\3I\3I\3I\3I\3I\5I\u036f\nI\3I\3I"+
		"\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I"+
		"\3I\3I\5I\u038c\nI\3I\3I\3I\3I\3I\3I\3I\5I\u0395\nI\3I\3I\3I\5I\u039a"+
		"\nI\3I\3I\3I\3I\3I\3I\3I\3I\5I\u03a4\nI\3J\3J\3J\3J\3J\3J\7J\u03ac\nJ"+
		"\fJ\16J\u03af\13J\3J\3J\5J\u03b3\nJ\3J\3J\3J\6J\u03b8\nJ\rJ\16J\u03b9"+
		"\3J\3J\5J\u03be\nJ\3J\3J\5J\u03c2\nJ\5J\u03c4\nJ\3K\3K\3K\7K\u03c9\nK"+
		"\fK\16K\u03cc\13K\3K\3K\3K\7K\u03d1\nK\fK\16K\u03d4\13K\3K\3K\3K\3K\3"+
		"L\3L\3L\7L\u03dd\nL\fL\16L\u03e0\13L\3L\5L\u03e3\nL\3M\7M\u03e6\nM\fM"+
		"\16M\u03e9\13M\3M\3M\3M\3M\3M\3N\3N\7N\u03f2\nN\fN\16N\u03f5\13N\3N\7"+
		"N\u03f8\nN\fN\16N\u03fb\13N\3N\3N\3O\6O\u0400\nO\rO\16O\u0401\3O\7O\u0405"+
		"\nO\fO\16O\u0408\13O\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u0414\nP\3Q\3Q\5"+
		"Q\u0418\nQ\3Q\3Q\5Q\u041c\nQ\3Q\3Q\5Q\u0420\nQ\5Q\u0422\nQ\3R\3R\5R\u0426"+
		"\nR\3S\7S\u0429\nS\fS\16S\u042c\13S\3S\3S\3S\3S\3S\3T\3T\3U\3U\3U\3U\3"+
		"V\3V\3V\7V\u043c\nV\fV\16V\u043f\13V\3W\3W\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0452\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\5Y\u0462\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u046c\nY\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0495\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u04a9\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u04b2"+
		"\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u04bb\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\5Y\u04c8\nY\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u04d0\nY\fY\16Y\u04d3\13Y\3Z\3Z\3Z\3"+
		"Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u04e4\nZ\3[\3[\3[\3[\3[\3[\3[\5"+
		"[\u04ed\n[\5[\u04ef\n[\3\\\3\\\3\\\3\\\3\\\5\\\u04f6\n\\\3\\\3\\\3\\\3"+
		"\\\3\\\5\\\u04fd\n\\\7\\\u04ff\n\\\f\\\16\\\u0502\13\\\5\\\u0504\n\\\3"+
		"]\3]\3]\5]\u0509\n]\3]\3]\3]\3^\3^\3^\3^\3_\3_\3_\3_\7_\u0516\n_\f_\16"+
		"_\u0519\13_\3_\3_\3_\3_\3_\3_\3_\3_\7_\u0523\n_\f_\16_\u0526\13_\3_\3"+
		"_\7_\u052a\n_\f_\16_\u052d\13_\5_\u052f\n_\3`\3`\5`\u0533\n`\3a\3a\3a"+
		"\3a\3b\3b\5b\u053b\nb\3b\3b\3b\2c\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\2\r\4\24\24>>\b\f\f\16"+
		"\16\20\21%&\63\63GG\4\24\24QQ\3\\_\4\t\tCC\6\b\b..EEJJ\4$$ZZ\5\5\5\26"+
		"\26XX\4..JJ\4\13\13YY\4\b\bEE\u05d2\2\u00c5\3\2\2\2\4\u00d8\3\2\2\2\6"+
		"\u00df\3\2\2\2\b\u00ec\3\2\2\2\n\u00f1\3\2\2\2\f\u00fa\3\2\2\2\16\u00fc"+
		"\3\2\2\2\20\u010b\3\2\2\2\22\u0116\3\2\2\2\24\u011b\3\2\2\2\26\u0123\3"+
		"\2\2\2\30\u0144\3\2\2\2\32\u0148\3\2\2\2\34\u014a\3\2\2\2\36\u0155\3\2"+
		"\2\2 \u015e\3\2\2\2\"\u017a\3\2\2\2$\u0181\3\2\2\2&\u0183\3\2\2\2(\u0187"+
		"\3\2\2\2*\u0195\3\2\2\2,\u019a\3\2\2\2.\u01a4\3\2\2\2\60\u01ac\3\2\2\2"+
		"\62\u01bd\3\2\2\2\64\u01d1\3\2\2\2\66\u01da\3\2\2\28\u01dd\3\2\2\2:\u01f5"+
		"\3\2\2\2<\u020b\3\2\2\2>\u020d\3\2\2\2@\u0215\3\2\2\2B\u0217\3\2\2\2D"+
		"\u0225\3\2\2\2F\u022d\3\2\2\2H\u0234\3\2\2\2J\u0237\3\2\2\2L\u023f\3\2"+
		"\2\2N\u0244\3\2\2\2P\u0250\3\2\2\2R\u0256\3\2\2\2T\u0260\3\2\2\2V\u0262"+
		"\3\2\2\2X\u027e\3\2\2\2Z\u0280\3\2\2\2\\\u0282\3\2\2\2^\u0284\3\2\2\2"+
		"`\u0296\3\2\2\2b\u0298\3\2\2\2d\u02a6\3\2\2\2f\u02a8\3\2\2\2h\u02b0\3"+
		"\2\2\2j\u02b9\3\2\2\2l\u02c6\3\2\2\2n\u02c8\3\2\2\2p\u02da\3\2\2\2r\u02dc"+
		"\3\2\2\2t\u02ea\3\2\2\2v\u02ec\3\2\2\2x\u02ee\3\2\2\2z\u02f0\3\2\2\2|"+
		"\u02fa\3\2\2\2~\u0302\3\2\2\2\u0080\u030a\3\2\2\2\u0082\u0311\3\2\2\2"+
		"\u0084\u0313\3\2\2\2\u0086\u0323\3\2\2\2\u0088\u034c\3\2\2\2\u008a\u034e"+
		"\3\2\2\2\u008c\u0354\3\2\2\2\u008e\u035a\3\2\2\2\u0090\u03a3\3\2\2\2\u0092"+
		"\u03c3\3\2\2\2\u0094\u03c5\3\2\2\2\u0096\u03d9\3\2\2\2\u0098\u03e7\3\2"+
		"\2\2\u009a\u03ef\3\2\2\2\u009c\u03ff\3\2\2\2\u009e\u0413\3\2\2\2\u00a0"+
		"\u0421\3\2\2\2\u00a2\u0425\3\2\2\2\u00a4\u042a\3\2\2\2\u00a6\u0432\3\2"+
		"\2\2\u00a8\u0434\3\2\2\2\u00aa\u0438\3\2\2\2\u00ac\u0440\3\2\2\2\u00ae"+
		"\u0442\3\2\2\2\u00b0\u0451\3\2\2\2\u00b2\u04e3\3\2\2\2\u00b4\u04ee\3\2"+
		"\2\2\u00b6\u0503\3\2\2\2\u00b8\u0508\3\2\2\2\u00ba\u050d\3\2\2\2\u00bc"+
		"\u052e\3\2\2\2\u00be\u0530\3\2\2\2\u00c0\u0534\3\2\2\2\u00c2\u0538\3\2"+
		"\2\2\u00c4\u00c6\5\4\3\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00ca\3\2\2\2\u00c7\u00c9\5\6\4\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2"+
		"\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00d0\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cd\u00cf\5\b\5\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d3\u00d4\7\1\2\2\u00d4\3\3\2\2\2\u00d5\u00d7\5z>\2\u00d6"+
		"\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\78\2\2\u00dc"+
		"\u00dd\5r:\2\u00dd\u00de\7O\2\2\u00de\5\3\2\2\2\u00df\u00e1\7F\2\2\u00e0"+
		"\u00e2\7D\2\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e6\5r:\2\u00e4\u00e5\7I\2\2\u00e5\u00e7\7\5\2\2\u00e6\u00e4"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7O\2\2\u00e9"+
		"\7\3\2\2\2\u00ea\u00ed\5\n\6\2\u00eb\u00ed\7O\2\2\u00ec\u00ea\3\2\2\2"+
		"\u00ec\u00eb\3\2\2\2\u00ed\t\3\2\2\2\u00ee\u00f0\5X-\2\u00ef\u00ee\3\2"+
		"\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f6\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\5\f\7\2\u00f5\u00f7\5\32"+
		"\16\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\13\3\2\2\2\u00f8\u00fb"+
		"\5\16\b\2\u00f9\u00fb\5\26\f\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2"+
		"\u00fb\r\3\2\2\2\u00fc\u00fd\7 \2\2\u00fd\u00ff\7e\2\2\u00fe\u0100\5\20"+
		"\t\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0103\3\2\2\2\u0101"+
		"\u0102\7>\2\2\u0102\u0104\5`\61\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0107\3\2\2\2\u0105\u0106\7T\2\2\u0106\u0108\5.\30\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\5\36"+
		"\20\2\u010a\17\3\2\2\2\u010b\u010c\7\7\2\2\u010c\u0111\5\22\n\2\u010d"+
		"\u010e\7,\2\2\u010e\u0110\5\22\n\2\u010f\u010d\3\2\2\2\u0110\u0113\3\2"+
		"\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0114\u0115\7S\2\2\u0115\21\3\2\2\2\u0116\u0119\7e\2\2"+
		"\u0117\u0118\7>\2\2\u0118\u011a\5\24\13\2\u0119\u0117\3\2\2\2\u0119\u011a"+
		"\3\2\2\2\u011a\23\3\2\2\2\u011b\u0120\5b\62\2\u011c\u011d\7\4\2\2\u011d"+
		"\u011f\5b\62\2\u011e\u011c\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0120\u0121\3\2\2\2\u0121\25\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124"+
		"\7c\2\2\u0124\u0127\7e\2\2\u0125\u0126\7T\2\2\u0126\u0128\5.\30\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\7:"+
		"\2\2\u012a\u012c\5\30\r\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u0134\3\2\2\2\u012d\u0131\7O\2\2\u012e\u0130\5\"\22\2\u012f\u012e\3\2"+
		"\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u012d\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136\u0137\7\17\2\2\u0137\27\3\2\2\2\u0138\u013d"+
		"\5,\27\2\u0139\u013a\7,\2\2\u013a\u013c\5,\27\2\u013b\u0139\3\2\2\2\u013c"+
		"\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0141\3\2"+
		"\2\2\u013f\u013d\3\2\2\2\u0140\u0142\7,\2\2\u0141\u0140\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0145\7,\2\2\u0144\u0138\3\2"+
		"\2\2\u0144\u0143\3\2\2\2\u0145\31\3\2\2\2\u0146\u0149\5\34\17\2\u0147"+
		"\u0149\5\u0086D\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149\33\3\2"+
		"\2\2\u014a\u014b\7\3\2\2\u014b\u014d\7e\2\2\u014c\u014e\5\20\t\2\u014d"+
		"\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u0150\7>"+
		"\2\2\u0150\u0152\5.\30\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0154\5 \21\2\u0154\35\3\2\2\2\u0155\u0159\7:\2\2"+
		"\u0156\u0158\5\"\22\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c"+
		"\u015d\7\17\2\2\u015d\37\3\2\2\2\u015e\u0169\7:\2\2\u015f\u0161\5X-\2"+
		"\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163"+
		"\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0168\5\66\34\2"+
		"\u0166\u0168\7O\2\2\u0167\u0162\3\2\2\2\u0167\u0166\3\2\2\2\u0168\u016b"+
		"\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016c\u016d\7\17\2\2\u016d!\3\2\2\2\u016e\u017b\7O\2\2"+
		"\u016f\u0171\5X-\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170"+
		"\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175"+
		"\u017b\5$\23\2\u0176\u0178\7D\2\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2"+
		"\2\2\u0178\u0179\3\2\2\2\u0179\u017b\5(\25\2\u017a\u016e\3\2\2\2\u017a"+
		"\u0172\3\2\2\2\u017a\u0177\3\2\2\2\u017b#\3\2\2\2\u017c\u0182\58\35\2"+
		"\u017d\u0182\5&\24\2\u017e\u0182\5:\36\2\u017f\u0182\5\32\16\2\u0180\u0182"+
		"\5\f\7\2\u0181\u017c\3\2\2\2\u0181\u017d\3\2\2\2\u0181\u017e\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0181\u0180\3\2\2\2\u0182%\3\2\2\2\u0183\u0184\5`\61\2"+
		"\u0184\u0185\5J&\2\u0185\u0186\7O\2\2\u0186\'\3\2\2\2\u0187\u018b\7:\2"+
		"\2\u0188\u018a\5*\26\2\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189"+
		"\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e"+
		"\u018f\7\17\2\2\u018f)\3\2\2\2\u0190\u0191\5\u008eH\2\u0191\u0192\7O\2"+
		"\2\u0192\u0196\3\2\2\2\u0193\u0196\5\n\6\2\u0194\u0196\5\u0090I\2\u0195"+
		"\u0190\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0194\3\2\2\2\u0196+\3\2\2\2"+
		"\u0197\u0199\5z>\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198"+
		"\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u019a\3\2\2\2\u019d"+
		"\u019f\7e\2\2\u019e\u01a0\5\u00c2b\2\u019f\u019e\3\2\2\2\u019f\u01a0\3"+
		"\2\2\2\u01a0\u01a2\3\2\2\2\u01a1\u01a3\5\36\20\2\u01a2\u01a1\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3-\3\2\2\2\u01a4\u01a9\5b\62\2\u01a5\u01a6\7,\2\2\u01a6"+
		"\u01a8\5b\62\2\u01a7\u01a5\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2"+
		"\2\2\u01a9\u01aa\3\2\2\2\u01aa/\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ad"+
		"\7\7\2\2\u01ad\u01b2\5\62\32\2\u01ae\u01af\7,\2\2\u01af\u01b1\5\62\32"+
		"\2\u01b0\u01ae\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3"+
		"\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b6\7S\2\2\u01b6"+
		"\61\3\2\2\2\u01b7\u01be\5\64\33\2\u01b8\u01bb\7\65\2\2\u01b9\u01ba\t\2"+
		"\2\2\u01ba\u01bc\5\64\33\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01be\3\2\2\2\u01bd\u01b7\3\2\2\2\u01bd\u01b8\3\2\2\2\u01be\63\3\2\2"+
		"\2\u01bf\u01c0\5d\63\2\u01c0\u01c1\7\6\2\2\u01c1\u01c6\7\'\2\2\u01c2\u01c3"+
		"\7\6\2\2\u01c3\u01c5\7\'\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01d2\3\2\2\2\u01c8\u01c6\3\2"+
		"\2\2\u01c9\u01ce\5b\62\2\u01ca\u01cb\7\6\2\2\u01cb\u01cd\7\'\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2"+
		"\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01bf\3\2\2\2\u01d1"+
		"\u01c9\3\2\2\2\u01d2\65\3\2\2\2\u01d3\u01db\5> \2\u01d4\u01db\5D#\2\u01d5"+
		"\u01d6\7\67\2\2\u01d6\u01d7\7e\2\2\u01d7\u01db\5F$\2\u01d8\u01db\5\32"+
		"\16\2\u01d9\u01db\5\f\7\2\u01da\u01d3\3\2\2\2\u01da\u01d4\3\2\2\2\u01da"+
		"\u01d5\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01d9\3\2\2\2\u01db\67\3\2\2"+
		"\2\u01dc\u01de\5\20\t\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2\2\2\u01de"+
		"\u01e1\3\2\2\2\u01df\u01e2\5`\61\2\u01e0\u01e2\7\67\2\2\u01e1\u01df\3"+
		"\2\2\2\u01e1\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\7e\2\2\u01e4"+
		"\u01e9\5h\65\2\u01e5\u01e6\7\6\2\2\u01e6\u01e8\7\'\2\2\u01e7\u01e5\3\2"+
		"\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"\u01ee\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ed\7\35\2\2\u01ed\u01ef\5"+
		"f\64\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0"+
		"\u01f3\5n8\2\u01f1\u01f3\7O\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f1\3\2\2"+
		"\2\u01f39\3\2\2\2\u01f4\u01f6\5\20\t\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6"+
		"\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\7e\2\2\u01f8\u01fb\5h\65\2\u01f9"+
		"\u01fa\7\35\2\2\u01fa\u01fc\5f\64\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3"+
		"\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\7:\2\2\u01fe\u0200\5p9\2\u01ff"+
		"\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0204\3\2\2\2\u0201\u0203\5*"+
		"\26\2\u0202\u0201\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204"+
		"\u0205\3\2\2\2\u0205\u0207\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0208\7\17"+
		"\2\2\u0208;\3\2\2\2\u0209\u020c\7@\2\2\u020a\u020c\5z>\2\u020b\u0209\3"+
		"\2\2\2\u020b\u020a\3\2\2\2\u020c=\3\2\2\2\u020d\u020e\5`\61\2\u020e\u020f"+
		"\7e\2\2\u020f\u0210\5@!\2\u0210?\3\2\2\2\u0211\u0212\5N(\2\u0212\u0213"+
		"\7O\2\2\u0213\u0216\3\2\2\2\u0214\u0216\5B\"\2\u0215\u0211\3\2\2\2\u0215"+
		"\u0214\3\2\2\2\u0216A\3\2\2\2\u0217\u021c\5h\65\2\u0218\u0219\7\6\2\2"+
		"\u0219\u021b\7\'\2\2\u021a\u0218\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a"+
		"\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u0221\3\2\2\2\u021e\u021c\3\2\2\2\u021f"+
		"\u0220\7\35\2\2\u0220\u0222\5f\64\2\u0221\u021f\3\2\2\2\u0221\u0222\3"+
		"\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\7O\2\2\u0224C\3\2\2\2\u0225\u0228"+
		"\5\20\t\2\u0226\u0229\5`\61\2\u0227\u0229\7\67\2\2\u0228\u0226\3\2\2\2"+
		"\u0228\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\7e\2\2\u022b\u022c"+
		"\5B\"\2\u022cE\3\2\2\2\u022d\u0230\5h\65\2\u022e\u022f\7\35\2\2\u022f"+
		"\u0231\5f\64\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\3\2"+
		"\2\2\u0232\u0233\7O\2\2\u0233G\3\2\2\2\u0234\u0235\7e\2\2\u0235\u0236"+
		"\5P)\2\u0236I\3\2\2\2\u0237\u023c\5L\'\2\u0238\u0239\7,\2\2\u0239\u023b"+
		"\5L\'\2\u023a\u0238\3\2\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023c"+
		"\u023d\3\2\2\2\u023dK\3\2\2\2\u023e\u023c\3\2\2\2\u023f\u0242\5R*\2\u0240"+
		"\u0241\7\33\2\2\u0241\u0243\5T+\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2"+
		"\2\2\u0243M\3\2\2\2\u0244\u0249\5P)\2\u0245\u0246\7,\2\2\u0246\u0248\5"+
		"H%\2\u0247\u0245\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249"+
		"\u024a\3\2\2\2\u024aO\3\2\2\2\u024b\u0249\3\2\2\2\u024c\u024d\7\6\2\2"+
		"\u024d\u024f\7\'\2\2\u024e\u024c\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u024e"+
		"\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0253\3\2\2\2\u0252\u0250\3\2\2\2\u0253"+
		"\u0254\7\33\2\2\u0254\u0255\5T+\2\u0255Q\3\2\2\2\u0256\u025b\7e\2\2\u0257"+
		"\u0258\7\6\2\2\u0258\u025a\7\'\2\2\u0259\u0257\3\2\2\2\u025a\u025d\3\2"+
		"\2\2\u025b\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025cS\3\2\2\2\u025d\u025b"+
		"\3\2\2\2\u025e\u0261\5V,\2\u025f\u0261\5\u00b0Y\2\u0260\u025e\3\2\2\2"+
		"\u0260\u025f\3\2\2\2\u0261U\3\2\2\2\u0262\u026e\7:\2\2\u0263\u0268\5T"+
		"+\2\u0264\u0265\7,\2\2\u0265\u0267\5T+\2\u0266\u0264\3\2\2\2\u0267\u026a"+
		"\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026c\3\2\2\2\u026a"+
		"\u0268\3\2\2\2\u026b\u026d\7,\2\2\u026c\u026b\3\2\2\2\u026c\u026d\3\2"+
		"\2\2\u026d\u026f\3\2\2\2\u026e\u0263\3\2\2\2\u026e\u026f\3\2\2\2\u026f"+
		"\u0270\3\2\2\2\u0270\u0271\7\17\2\2\u0271W\3\2\2\2\u0272\u027f\5z>\2\u0273"+
		"\u027f\7)\2\2\u0274\u027f\7K\2\2\u0275\u027f\7\64\2\2\u0276\u027f\7D\2"+
		"\2\u0277\u027f\7\r\2\2\u0278\u027f\7@\2\2\u0279\u027f\7<\2\2\u027a\u027f"+
		"\7+\2\2\u027b\u027f\7#\2\2\u027c\u027f\7N\2\2\u027d\u027f\7\22\2\2\u027e"+
		"\u0272\3\2\2\2\u027e\u0273\3\2\2\2\u027e\u0274\3\2\2\2\u027e\u0275\3\2"+
		"\2\2\u027e\u0276\3\2\2\2\u027e\u0277\3\2\2\2\u027e\u0278\3\2\2\2\u027e"+
		"\u0279\3\2\2\2\u027e\u027a\3\2\2\2\u027e\u027b\3\2\2\2\u027e\u027c\3\2"+
		"\2\2\u027e\u027d\3\2\2\2\u027fY\3\2\2\2\u0280\u0281\5r:\2\u0281[\3\2\2"+
		"\2\u0282\u0283\7e\2\2\u0283]\3\2\2\2\u0284\u0285\5r:\2\u0285_\3\2\2\2"+
		"\u0286\u028b\5b\62\2\u0287\u0288\7\6\2\2\u0288\u028a\7\'\2\2\u0289\u0287"+
		"\3\2\2\2\u028a\u028d\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c"+
		"\u0297\3\2\2\2\u028d\u028b\3\2\2\2\u028e\u0293\5d\63\2\u028f\u0290\7\6"+
		"\2\2\u0290\u0292\7\'\2\2\u0291\u028f\3\2\2\2\u0292\u0295\3\2\2\2\u0293"+
		"\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0297\3\2\2\2\u0295\u0293\3\2"+
		"\2\2\u0296\u0286\3\2\2\2\u0296\u028e\3\2\2\2\u0297a\3\2\2\2\u0298\u029a"+
		"\7e\2\2\u0299\u029b\5\60\31\2\u029a\u0299\3\2\2\2\u029a\u029b\3\2\2\2"+
		"\u029b\u02a3\3\2\2\2\u029c\u029d\7I\2\2\u029d\u029f\7e\2\2\u029e\u02a0"+
		"\5\60\31\2\u029f\u029e\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a2\3\2\2\2"+
		"\u02a1\u029c\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4"+
		"\3\2\2\2\u02a4c\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a6\u02a7\t\3\2\2\u02a7"+
		"e\3\2\2\2\u02a8\u02ad\5r:\2\u02a9\u02aa\7,\2\2\u02aa\u02ac\5r:\2\u02ab"+
		"\u02a9\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3\2"+
		"\2\2\u02aeg\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0\u02b2\7/\2\2\u02b1\u02b3"+
		"\5j\66\2\u02b2\u02b1\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4"+
		"\u02b5\7\30\2\2\u02b5i\3\2\2\2\u02b6\u02b8\5<\37\2\u02b7\u02b6\3\2\2\2"+
		"\u02b8\u02bb\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bc"+
		"\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bc\u02bd\5`\61\2\u02bd\u02be\5l\67\2\u02be"+
		"k\3\2\2\2\u02bf\u02c0\79\2\2\u02c0\u02c7\5R*\2\u02c1\u02c4\5R*\2\u02c2"+
		"\u02c3\7,\2\2\u02c3\u02c5\5j\66\2\u02c4\u02c2\3\2\2\2\u02c4\u02c5\3\2"+
		"\2\2\u02c5\u02c7\3\2\2\2\u02c6\u02bf\3\2\2\2\u02c6\u02c1\3\2\2\2\u02c7"+
		"m\3\2\2\2\u02c8\u02c9\5(\25\2\u02c9o\3\2\2\2\u02ca\u02cc\5\u00c0a\2\u02cb"+
		"\u02ca\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce\t\4"+
		"\2\2\u02ce\u02cf\5\u00c2b\2\u02cf\u02d0\7O\2\2\u02d0\u02db\3\2\2\2\u02d1"+
		"\u02d2\5\u00b2Z\2\u02d2\u02d4\7I\2\2\u02d3\u02d5\5\u00c0a\2\u02d4\u02d3"+
		"\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d7\7\24\2\2"+
		"\u02d7\u02d8\5\u00c2b\2\u02d8\u02d9\7O\2\2\u02d9\u02db\3\2\2\2\u02da\u02cb"+
		"\3\2\2\2\u02da\u02d1\3\2\2\2\u02dbq\3\2\2\2\u02dc\u02e1\7e\2\2\u02dd\u02de"+
		"\7I\2\2\u02de\u02e0\7e\2\2\u02df\u02dd\3\2\2\2\u02e0\u02e3\3\2\2\2\u02e1"+
		"\u02df\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2s\3\2\2\2\u02e3\u02e1\3\2\2\2"+
		"\u02e4\u02eb\5v<\2\u02e5\u02eb\7`\2\2\u02e6\u02eb\7a\2\2\u02e7\u02eb\7"+
		"b\2\2\u02e8\u02eb\5x=\2\u02e9\u02eb\7\34\2\2\u02ea\u02e4\3\2\2\2\u02ea"+
		"\u02e5\3\2\2\2\u02ea\u02e6\3\2\2\2\u02ea\u02e7\3\2\2\2\u02ea\u02e8\3\2"+
		"\2\2\u02ea\u02e9\3\2\2\2\u02ebu\3\2\2\2\u02ec\u02ed\t\5\2\2\u02edw\3\2"+
		"\2\2\u02ee\u02ef\t\6\2\2\u02efy\3\2\2\2\u02f0\u02f1\7\32\2\2\u02f1\u02f8"+
		"\5|?\2\u02f2\u02f5\7/\2\2\u02f3\u02f6\5~@\2\u02f4\u02f6\5\u0082B\2\u02f5"+
		"\u02f3\3\2\2\2\u02f5\u02f4\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\3\2"+
		"\2\2\u02f7\u02f9\7\30\2\2\u02f8\u02f2\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9"+
		"{\3\2\2\2\u02fa\u02ff\7e\2\2\u02fb\u02fc\7I\2\2\u02fc\u02fe\7e\2\2\u02fd"+
		"\u02fb\3\2\2\2\u02fe\u0301\3\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u0300\3\2"+
		"\2\2\u0300}\3\2\2\2\u0301\u02ff\3\2\2\2\u0302\u0307\5\u0080A\2\u0303\u0304"+
		"\7,\2\2\u0304\u0306\5\u0080A\2\u0305\u0303\3\2\2\2\u0306\u0309\3\2\2\2"+
		"\u0307\u0305\3\2\2\2\u0307\u0308\3\2\2\2\u0308\177\3\2\2\2\u0309\u0307"+
		"\3\2\2\2\u030a\u030b\7e\2\2\u030b\u030c\7\33\2\2\u030c\u030d\5\u0082B"+
		"\2\u030d\u0081\3\2\2\2\u030e\u0312\5\u00b0Y\2\u030f\u0312\5z>\2\u0310"+
		"\u0312\5\u0084C\2\u0311\u030e\3\2\2\2\u0311\u030f\3\2\2\2\u0311\u0310"+
		"\3\2\2\2\u0312\u0083\3\2\2\2\u0313\u031c\7:\2\2\u0314\u0319\5\u0082B\2"+
		"\u0315\u0316\7,\2\2\u0316\u0318\5\u0082B\2\u0317\u0315\3\2\2\2\u0318\u031b"+
		"\3\2\2\2\u0319\u0317\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031d\3\2\2\2\u031b"+
		"\u0319\3\2\2\2\u031c\u0314\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031f\3\2"+
		"\2\2\u031e\u0320\7,\2\2\u031f\u031e\3\2\2\2\u031f\u0320\3\2\2\2\u0320"+
		"\u0321\3\2\2\2\u0321\u0322\7\17\2\2\u0322\u0085\3\2\2\2\u0323\u0324\7"+
		"\32\2\2\u0324\u0325\7\3\2\2\u0325\u0326\7e\2\2\u0326\u0330\7:\2\2\u0327"+
		"\u0329\5X-\2\u0328\u0327\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u0328\3\2\2"+
		"\2\u032a\u032b\3\2\2\2\u032b\u032d\3\2\2\2\u032c\u032a\3\2\2\2\u032d\u032f"+
		"\5\u0088E\2\u032e\u032a\3\2\2\2\u032f\u0332\3\2\2\2\u0330\u032e\3\2\2"+
		"\2\u0330\u0331\3\2\2\2\u0331\u0333\3\2\2\2\u0332\u0330\3\2\2\2\u0333\u0334"+
		"\7\17\2\2\u0334\u0087\3\2\2\2\u0335\u0338\5`\61\2\u0336\u0339\5\u008a"+
		"F\2\u0337\u0339\5J&\2\u0338\u0336\3\2\2\2\u0338\u0337\3\2\2\2\u0339\u033a"+
		"\3\2\2\2\u033a\u033b\7O\2\2\u033b\u034d\3\2\2\2\u033c\u033e\5\f\7\2\u033d"+
		"\u033f\7O\2\2\u033e\u033d\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u034d\3\2"+
		"\2\2\u0340\u0342\5\34\17\2\u0341\u0343\7O\2\2\u0342\u0341\3\2\2\2\u0342"+
		"\u0343\3\2\2\2\u0343\u034d\3\2\2\2\u0344\u0346\5\26\f\2\u0345\u0347\7"+
		"O\2\2\u0346\u0345\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u034d\3\2\2\2\u0348"+
		"\u034a\5\u0086D\2\u0349\u034b\7O\2\2\u034a\u0349\3\2\2\2\u034a\u034b\3"+
		"\2\2\2\u034b\u034d\3\2\2\2\u034c\u0335\3\2\2\2\u034c\u033c\3\2\2\2\u034c"+
		"\u0340\3\2\2\2\u034c\u0344\3\2\2\2\u034c\u0348\3\2\2\2\u034d\u0089\3\2"+
		"\2\2\u034e\u034f\7e\2\2\u034f\u0350\7/\2\2\u0350\u0352\7\30\2\2\u0351"+
		"\u0353\5\u008cG\2\u0352\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u008b"+
		"\3\2\2\2\u0354\u0355\7*\2\2\u0355\u0356\5\u0082B\2\u0356\u008d\3\2\2\2"+
		"\u0357\u0359\5<\37\2\u0358\u0357\3\2\2\2\u0359\u035c\3\2\2\2\u035a\u0358"+
		"\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035d\3\2\2\2\u035c\u035a\3\2\2\2\u035d"+
		"\u035e\5`\61\2\u035e\u035f\5J&\2\u035f\u008f\3\2\2\2\u0360\u03a4\5(\25"+
		"\2\u0361\u0362\7d\2\2\u0362\u0365\5\u00b0Y\2\u0363\u0364\7\60\2\2\u0364"+
		"\u0366\5\u00b0Y\2\u0365\u0363\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0367"+
		"\3\2\2\2\u0367\u0368\7O\2\2\u0368\u03a4\3\2\2\2\u0369\u036a\7\61\2\2\u036a"+
		"\u036b\5\u00a8U\2\u036b\u036e\5\u0090I\2\u036c\u036d\7A\2\2\u036d\u036f"+
		"\5\u0090I\2\u036e\u036c\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u03a4\3\2\2"+
		"\2\u0370\u0371\7L\2\2\u0371\u0372\7/\2\2\u0372\u0373\5\u00a0Q\2\u0373"+
		"\u0374\7\30\2\2\u0374\u0375\5\u0090I\2\u0375\u03a4\3\2\2\2\u0376\u0377"+
		"\7-\2\2\u0377\u0378\5\u00a8U\2\u0378\u0379\5\u0090I\2\u0379\u03a4\3\2"+
		"\2\2\u037a\u037b\7\25\2\2\u037b\u037c\5\u0090I\2\u037c\u037d\7-\2\2\u037d"+
		"\u037e\5\u00a8U\2\u037e\u037f\7O\2\2\u037f\u03a4\3\2\2\2\u0380\u03a4\5"+
		"\u0092J\2\u0381\u0382\7V\2\2\u0382\u0383\5\u00a8U\2\u0383\u0384\5\u009a"+
		"N\2\u0384\u03a4\3\2\2\2\u0385\u0386\7+\2\2\u0386\u0387\5\u00a8U\2\u0387"+
		"\u0388\5(\25\2\u0388\u03a4\3\2\2\2\u0389\u038b\7M\2\2\u038a\u038c\5\u00b0"+
		"Y\2\u038b\u038a\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u038d\3\2\2\2\u038d"+
		"\u03a4\7O\2\2\u038e\u038f\7\31\2\2\u038f\u0390\5\u00b0Y\2\u0390\u0391"+
		"\7O\2\2\u0391\u03a4\3\2\2\2\u0392\u0394\7;\2\2\u0393\u0395\7e\2\2\u0394"+
		"\u0393\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u03a4\7O"+
		"\2\2\u0397\u0399\7\n\2\2\u0398\u039a\7e\2\2\u0399\u0398\3\2\2\2\u0399"+
		"\u039a\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u03a4\7O\2\2\u039c\u03a4\7O\2"+
		"\2\u039d\u039e\5\u00acW\2\u039e\u039f\7O\2\2\u039f\u03a4\3\2\2\2\u03a0"+
		"\u03a1\7e\2\2\u03a1\u03a2\7\60\2\2\u03a2\u03a4\5\u0090I\2\u03a3\u0360"+
		"\3\2\2\2\u03a3\u0361\3\2\2\2\u03a3\u0369\3\2\2\2\u03a3\u0370\3\2\2\2\u03a3"+
		"\u0376\3\2\2\2\u03a3\u037a\3\2\2\2\u03a3\u0380\3\2\2\2\u03a3\u0381\3\2"+
		"\2\2\u03a3\u0385\3\2\2\2\u03a3\u0389\3\2\2\2\u03a3\u038e\3\2\2\2\u03a3"+
		"\u0392\3\2\2\2\u03a3\u0397\3\2\2\2\u03a3\u039c\3\2\2\2\u03a3\u039d\3\2"+
		"\2\2\u03a3\u03a0\3\2\2\2\u03a4\u0091\3\2\2\2\u03a5\u03a6\7\66\2\2\u03a6"+
		"\u03a7\7/\2\2\u03a7\u03a8\5\u0096L\2\u03a8\u03a9\7\30\2\2\u03a9\u03ad"+
		"\5(\25\2\u03aa\u03ac\5\u0094K\2\u03ab\u03aa\3\2\2\2\u03ac\u03af\3\2\2"+
		"\2\u03ad\u03ab\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03b2\3\2\2\2\u03af\u03ad"+
		"\3\2\2\2\u03b0\u03b1\7!\2\2\u03b1\u03b3\5(\25\2\u03b2\u03b0\3\2\2\2\u03b2"+
		"\u03b3\3\2\2\2\u03b3\u03c4\3\2\2\2\u03b4\u03b5\7\66\2\2\u03b5\u03c1\5"+
		"(\25\2\u03b6\u03b8\5\u0094K\2\u03b7\u03b6\3\2\2\2\u03b8\u03b9\3\2\2\2"+
		"\u03b9\u03b7\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bd\3\2\2\2\u03bb\u03bc"+
		"\7!\2\2\u03bc\u03be\5(\25\2\u03bd\u03bb\3\2\2\2\u03bd\u03be\3\2\2\2\u03be"+
		"\u03c2\3\2\2\2\u03bf\u03c0\7!\2\2\u03c0\u03c2\5(\25\2\u03c1\u03b7\3\2"+
		"\2\2\u03c1\u03bf\3\2\2\2\u03c2\u03c4\3\2\2\2\u03c3\u03a5\3\2\2\2\u03c3"+
		"\u03b4\3\2\2\2\u03c4\u0093\3\2\2\2\u03c5\u03c6\7B\2\2\u03c6\u03ca\7/\2"+
		"\2\u03c7\u03c9\5<\37\2\u03c8\u03c7\3\2\2\2\u03c9\u03cc\3\2\2\2\u03ca\u03c8"+
		"\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cd\3\2\2\2\u03cc\u03ca\3\2\2\2\u03cd"+
		"\u03d2\5^\60\2\u03ce\u03cf\7\"\2\2\u03cf\u03d1\5^\60\2\u03d0\u03ce\3\2"+
		"\2\2\u03d1\u03d4\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3"+
		"\u03d5\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d5\u03d6\7e\2\2\u03d6\u03d7\7\30"+
		"\2\2\u03d7\u03d8\5(\25\2\u03d8\u0095\3\2\2\2\u03d9\u03de\5\u0098M\2\u03da"+
		"\u03db\7O\2\2\u03db\u03dd\5\u0098M\2\u03dc\u03da\3\2\2\2\u03dd\u03e0\3"+
		"\2\2\2\u03de\u03dc\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e2\3\2\2\2\u03e0"+
		"\u03de\3\2\2\2\u03e1\u03e3\7O\2\2\u03e2\u03e1\3\2\2\2\u03e2\u03e3\3\2"+
		"\2\2\u03e3\u0097\3\2\2\2\u03e4\u03e6\5<\37\2\u03e5\u03e4\3\2\2\2\u03e6"+
		"\u03e9\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03ea\3\2"+
		"\2\2\u03e9\u03e7\3\2\2\2\u03ea\u03eb\5b\62\2\u03eb\u03ec\5R*\2\u03ec\u03ed"+
		"\7\33\2\2\u03ed\u03ee\5\u00b0Y\2\u03ee\u0099\3\2\2\2\u03ef\u03f3\7:\2"+
		"\2\u03f0\u03f2\5\u009cO\2\u03f1\u03f0\3\2\2\2\u03f2\u03f5\3\2\2\2\u03f3"+
		"\u03f1\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f9\3\2\2\2\u03f5\u03f3\3\2"+
		"\2\2\u03f6\u03f8\5\u009eP\2\u03f7\u03f6\3\2\2\2\u03f8\u03fb\3\2\2\2\u03f9"+
		"\u03f7\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fc\3\2\2\2\u03fb\u03f9\3\2"+
		"\2\2\u03fc\u03fd\7\17\2\2\u03fd\u009b\3\2\2\2\u03fe\u0400\5\u009eP\2\u03ff"+
		"\u03fe\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u03ff\3\2\2\2\u0401\u0402\3\2"+
		"\2\2\u0402\u0406\3\2\2\2\u0403\u0405\5*\26\2\u0404\u0403\3\2\2\2\u0405"+
		"\u0408\3\2\2\2\u0406\u0404\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u009d\3\2"+
		"\2\2\u0408\u0406\3\2\2\2\u0409\u040a\7\23\2\2\u040a\u040b\5\u00aeX\2\u040b"+
		"\u040c\7\60\2\2\u040c\u0414\3\2\2\2\u040d\u040e\7\23\2\2\u040e\u040f\5"+
		"\\/\2\u040f\u0410\7\60\2\2\u0410\u0414\3\2\2\2\u0411\u0412\7*\2\2\u0412"+
		"\u0414\7\60\2\2\u0413\u0409\3\2\2\2\u0413\u040d\3\2\2\2\u0413\u0411\3"+
		"\2\2\2\u0414\u009f\3\2\2\2\u0415\u0422\5\u00a4S\2\u0416\u0418\5\u00a2"+
		"R\2\u0417\u0416\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u0419\3\2\2\2\u0419"+
		"\u041b\7O\2\2\u041a\u041c\5\u00b0Y\2\u041b\u041a\3\2\2\2\u041b\u041c\3"+
		"\2\2\2\u041c\u041d\3\2\2\2\u041d\u041f\7O\2\2\u041e\u0420\5\u00a6T\2\u041f"+
		"\u041e\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u0422\3\2\2\2\u0421\u0415\3\2"+
		"\2\2\u0421\u0417\3\2\2\2\u0422\u00a1\3\2\2\2\u0423\u0426\5\u008eH\2\u0424"+
		"\u0426\5\u00aaV\2\u0425\u0423\3\2\2\2\u0425\u0424\3\2\2\2\u0426\u00a3"+
		"\3\2\2\2\u0427\u0429\5<\37\2\u0428\u0427\3\2\2\2\u0429\u042c\3\2\2\2\u042a"+
		"\u0428\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042d\3\2\2\2\u042c\u042a\3\2"+
		"\2\2\u042d\u042e\5`\61\2\u042e\u042f\7e\2\2\u042f\u0430\7\60\2\2\u0430"+
		"\u0431\5\u00b0Y\2\u0431\u00a5\3\2\2\2\u0432\u0433\5\u00aaV\2\u0433\u00a7"+
		"\3\2\2\2\u0434\u0435\7/\2\2\u0435\u0436\5\u00b0Y\2\u0436\u0437\7\30\2"+
		"\2\u0437\u00a9\3\2\2\2\u0438\u043d\5\u00b0Y\2\u0439\u043a\7,\2\2\u043a"+
		"\u043c\5\u00b0Y\2\u043b\u0439\3\2\2\2\u043c\u043f\3\2\2\2\u043d\u043b"+
		"\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u00ab\3\2\2\2\u043f\u043d\3\2\2\2\u0440"+
		"\u0441\5\u00b0Y\2\u0441\u00ad\3\2\2\2\u0442\u0443\5\u00b0Y\2\u0443\u00af"+
		"\3\2\2\2\u0444\u0445\bY\1\2\u0445\u0446\t\7\2\2\u0446\u0452\5\u00b0Y\2"+
		"\u0447\u0448\t\b\2\2\u0448\u0452\5\u00b0Y\2\u0449\u044a\7/\2\2\u044a\u044b"+
		"\5`\61\2\u044b\u044c\7\30\2\2\u044c\u044d\5\u00b0Y\2\u044d\u0452\3\2\2"+
		"\2\u044e\u0452\5\u00b2Z\2\u044f\u0450\7\37\2\2\u0450\u0452\5\u00b4[\2"+
		"\u0451\u0444\3\2\2\2\u0451\u0447\3\2\2\2\u0451\u0449\3\2\2\2\u0451\u044e"+
		"\3\2\2\2\u0451\u044f\3\2\2\2\u0452\u04d1\3\2\2\2\u0453\u0454\6Y\2\3\u0454"+
		"\u0455\t\t\2\2\u0455\u04d0\5\u00b0Y\2\u0456\u0457\6Y\3\3\u0457\u0458\t"+
		"\n\2\2\u0458\u04d0\5\u00b0Y\2\u0459\u0461\6Y\4\3\u045a\u045b\7\7\2\2\u045b"+
		"\u0462\7\7\2\2\u045c\u045d\7S\2\2\u045d\u045e\7S\2\2\u045e\u0462\7S\2"+
		"\2\u045f\u0460\7S\2\2\u0460\u0462\7S\2\2\u0461\u045a\3\2\2\2\u0461\u045c"+
		"\3\2\2\2\u0461\u045f\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u04d0\5\u00b0Y"+
		"\2\u0464\u046b\6Y\5\3\u0465\u0466\7\7\2\2\u0466\u046c\7\33\2\2\u0467\u0468"+
		"\7S\2\2\u0468\u046c\7\33\2\2\u0469\u046c\7S\2\2\u046a\u046c\7\7\2\2\u046b"+
		"\u0465\3\2\2\2\u046b\u0467\3\2\2\2\u046b\u0469\3\2\2\2\u046b\u046a\3\2"+
		"\2\2\u046c\u046d\3\2\2\2\u046d\u04d0\5\u00b0Y\2\u046e\u046f\6Y\6\3\u046f"+
		"\u0470\t\13\2\2\u0470\u04d0\5\u00b0Y\2\u0471\u0472\6Y\7\3\u0472\u0473"+
		"\7\4\2\2\u0473\u04d0\5\u00b0Y\2\u0474\u0475\6Y\b\3\u0475\u0476\7H\2\2"+
		"\u0476\u04d0\5\u00b0Y\2\u0477\u0478\6Y\t\3\u0478\u0479\7\"\2\2\u0479\u04d0"+
		"\5\u00b0Y\2\u047a\u047b\6Y\n\3\u047b\u047c\7P\2\2\u047c\u04d0\5\u00b0"+
		"Y\2\u047d\u047e\6Y\13\3\u047e\u047f\7R\2\2\u047f\u04d0\5\u00b0Y\2\u0480"+
		"\u0494\6Y\f\3\u0481\u0495\7?\2\2\u0482\u0495\7=\2\2\u0483\u0495\7(\2\2"+
		"\u0484\u0495\7\27\2\2\u0485\u0495\7W\2\2\u0486\u0495\7\62\2\2\u0487\u0495"+
		"\7\36\2\2\u0488\u0495\7\33\2\2\u0489\u048a\7S\2\2\u048a\u048b\7S\2\2\u048b"+
		"\u0495\7\33\2\2\u048c\u048d\7S\2\2\u048d\u048e\7S\2\2\u048e\u048f\7S\2"+
		"\2\u048f\u0495\7\33\2\2\u0490\u0491\7\7\2\2\u0491\u0492\7\7\2\2\u0492"+
		"\u0495\7\33\2\2\u0493\u0495\7U\2\2\u0494\u0481\3\2\2\2\u0494\u0482\3\2"+
		"\2\2\u0494\u0483\3\2\2\2\u0494\u0484\3\2\2\2\u0494\u0485\3\2\2\2\u0494"+
		"\u0486\3\2\2\2\u0494\u0487\3\2\2\2\u0494\u0488\3\2\2\2\u0494\u0489\3\2"+
		"\2\2\u0494\u048c\3\2\2\2\u0494\u0490\3\2\2\2\u0494\u0493\3\2\2\2\u0495"+
		"\u0496\3\2\2\2\u0496\u04d0\5\u00b0Y\2\u0497\u0498\6Y\r\3\u0498\u0499\7"+
		"\65\2\2\u0499\u049a\5\u00b0Y\2\u049a\u049b\7\60\2\2\u049b\u049c\5\u00b0"+
		"Y\2\u049c\u04d0\3\2\2\2\u049d\u049e\6Y\16\3\u049e\u049f\7I\2\2\u049f\u04d0"+
		"\7e\2\2\u04a0\u04a1\6Y\17\3\u04a1\u04a2\7I\2\2\u04a2\u04d0\7Q\2\2\u04a3"+
		"\u04a4\6Y\20\3\u04a4\u04a5\7I\2\2\u04a5\u04a6\7\24\2\2\u04a6\u04a8\7/"+
		"\2\2\u04a7\u04a9\5\u00aaV\2\u04a8\u04a7\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9"+
		"\u04aa\3\2\2\2\u04aa\u04d0\7\30\2\2\u04ab\u04ac\6Y\21\3\u04ac\u04ad\7"+
		"I\2\2\u04ad\u04ae\7\37\2\2\u04ae\u04af\7e\2\2\u04af\u04b1\7/\2\2\u04b0"+
		"\u04b2\5\u00aaV\2\u04b1\u04b0\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3"+
		"\3\2\2\2\u04b3\u04d0\7\30\2\2\u04b4\u04b5\6Y\22\3\u04b5\u04b6\7I\2\2\u04b6"+
		"\u04b7\7\24\2\2\u04b7\u04b8\7I\2\2\u04b8\u04ba\7e\2\2\u04b9\u04bb\5\u00c2"+
		"b\2\u04ba\u04b9\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04d0\3\2\2\2\u04bc"+
		"\u04bd\6Y\23\3\u04bd\u04be\7I\2\2\u04be\u04d0\5\u00ba^\2\u04bf\u04c0\6"+
		"Y\24\3\u04c0\u04c1\7\6\2\2\u04c1\u04c2\5\u00b0Y\2\u04c2\u04c3\7\'\2\2"+
		"\u04c3\u04d0\3\2\2\2\u04c4\u04c5\6Y\25\3\u04c5\u04c7\7/\2\2\u04c6\u04c8"+
		"\5\u00aaV\2\u04c7\u04c6\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04c9\3\2\2"+
		"\2\u04c9\u04d0\7\30\2\2\u04ca\u04cb\6Y\26\3\u04cb\u04d0\t\f\2\2\u04cc"+
		"\u04cd\6Y\27\3\u04cd\u04ce\7[\2\2\u04ce\u04d0\5`\61\2\u04cf\u0453\3\2"+
		"\2\2\u04cf\u0456\3\2\2\2\u04cf\u0459\3\2\2\2\u04cf\u0464\3\2\2\2\u04cf"+
		"\u046e\3\2\2\2\u04cf\u0471\3\2\2\2\u04cf\u0474\3\2\2\2\u04cf\u0477\3\2"+
		"\2\2\u04cf\u047a\3\2\2\2\u04cf\u047d\3\2\2\2\u04cf\u0480\3\2\2\2\u04cf"+
		"\u0497\3\2\2\2\u04cf\u049d\3\2\2\2\u04cf\u04a0\3\2\2\2\u04cf\u04a3\3\2"+
		"\2\2\u04cf\u04ab\3\2\2\2\u04cf\u04b4\3\2\2\2\u04cf\u04bc\3\2\2\2\u04cf"+
		"\u04bf\3\2\2\2\u04cf\u04c4\3\2\2\2\u04cf\u04ca\3\2\2\2\u04cf\u04cc\3\2"+
		"\2\2\u04d0\u04d3\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2"+
		"\u00b1\3\2\2\2\u04d3\u04d1\3\2\2\2\u04d4\u04d5\7/\2\2\u04d5\u04d6\5\u00b0"+
		"Y\2\u04d6\u04d7\7\30\2\2\u04d7\u04e4\3\2\2\2\u04d8\u04e4\7Q\2\2\u04d9"+
		"\u04e4\7\24\2\2\u04da\u04e4\5t;\2\u04db\u04e4\7e\2\2\u04dc\u04dd\5`\61"+
		"\2\u04dd\u04de\7I\2\2\u04de\u04df\7 \2\2\u04df\u04e4\3\2\2\2\u04e0\u04e1"+
		"\7\67\2\2\u04e1\u04e2\7I\2\2\u04e2\u04e4\7 \2\2\u04e3\u04d4\3\2\2\2\u04e3"+
		"\u04d8\3\2\2\2\u04e3\u04d9\3\2\2\2\u04e3\u04da\3\2\2\2\u04e3\u04db\3\2"+
		"\2\2\u04e3\u04dc\3\2\2\2\u04e3\u04e0\3\2\2\2\u04e4\u00b3\3\2\2\2\u04e5"+
		"\u04e6\5\u00c0a\2\u04e6\u04e7\5\u00b6\\\2\u04e7\u04e8\5\u00be`\2\u04e8"+
		"\u04ef\3\2\2\2\u04e9\u04ec\5\u00b6\\\2\u04ea\u04ed\5\u00bc_\2\u04eb\u04ed"+
		"\5\u00be`\2\u04ec\u04ea\3\2\2\2\u04ec\u04eb\3\2\2\2\u04ed\u04ef\3\2\2"+
		"\2\u04ee\u04e5\3\2\2\2\u04ee\u04e9\3\2\2\2\u04ef\u00b5\3\2\2\2\u04f0\u0504"+
		"\5d\63\2\u04f1\u04f5\7e\2\2\u04f2\u04f6\5\60\31\2\u04f3\u04f4\7\7\2\2"+
		"\u04f4\u04f6\7S\2\2\u04f5\u04f2\3\2\2\2\u04f5\u04f3\3\2\2\2\u04f5\u04f6"+
		"\3\2\2\2\u04f6\u0500\3\2\2\2\u04f7\u04f8\7I\2\2\u04f8\u04fc\7e\2\2\u04f9"+
		"\u04fd\5\60\31\2\u04fa\u04fb\7\7\2\2\u04fb\u04fd\7S\2\2\u04fc\u04f9\3"+
		"\2\2\2\u04fc\u04fa\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u04ff\3\2\2\2\u04fe"+
		"\u04f7\3\2\2\2\u04ff\u0502\3\2\2\2\u0500\u04fe\3\2\2\2\u0500\u0501\3\2"+
		"\2\2\u0501\u0504\3\2\2\2\u0502\u0500\3\2\2\2\u0503\u04f0\3\2\2\2\u0503"+
		"\u04f1\3\2\2\2\u0504\u00b7\3\2\2\2\u0505\u0509\5\u00c0a\2\u0506\u0507"+
		"\7\7\2\2\u0507\u0509\7S\2\2\u0508\u0505\3\2\2\2\u0508\u0506\3\2\2\2\u0508"+
		"\u0509\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050b\7e\2\2\u050b\u050c\5\u00be"+
		"`\2\u050c\u00b9\3\2\2\2\u050d\u050e\5\u00c0a\2\u050e\u050f\7e\2\2\u050f"+
		"\u0510\5\u00c2b\2\u0510\u00bb\3\2\2\2\u0511\u0512\7\6\2\2\u0512\u0517"+
		"\7\'\2\2\u0513\u0514\7\6\2\2\u0514\u0516\7\'\2\2\u0515\u0513\3\2\2\2\u0516"+
		"\u0519\3\2\2\2\u0517\u0515\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u051a\3\2"+
		"\2\2\u0519\u0517\3\2\2\2\u051a\u052f\5V,\2\u051b\u051c\7\6\2\2\u051c\u051d"+
		"\5\u00b0Y\2\u051d\u0524\7\'\2\2\u051e\u051f\7\6\2\2\u051f\u0520\5\u00b0"+
		"Y\2\u0520\u0521\7\'\2\2\u0521\u0523\3\2\2\2\u0522\u051e\3\2\2\2\u0523"+
		"\u0526\3\2\2\2\u0524\u0522\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u052b\3\2"+
		"\2\2\u0526\u0524\3\2\2\2\u0527\u0528\7\6\2\2\u0528\u052a\7\'\2\2\u0529"+
		"\u0527\3\2\2\2\u052a\u052d\3\2\2\2\u052b\u0529\3\2\2\2\u052b\u052c\3\2"+
		"\2\2\u052c\u052f\3\2\2\2\u052d\u052b\3\2\2\2\u052e\u0511\3\2\2\2\u052e"+
		"\u051b\3\2\2\2\u052f\u00bd\3\2\2\2\u0530\u0532\5\u00c2b\2\u0531\u0533"+
		"\5\36\20\2\u0532\u0531\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u00bf\3\2\2\2"+
		"\u0534\u0535\7\7\2\2\u0535\u0536\5.\30\2\u0536\u0537\7S\2\2\u0537\u00c1"+
		"\3\2\2\2\u0538\u053a\7/\2\2\u0539\u053b\5\u00aaV\2\u053a\u0539\3\2\2\2"+
		"\u053a\u053b\3\2\2\2\u053b\u053c\3\2\2\2\u053c\u053d\7\30\2\2\u053d\u00c3"+
		"\3\2\2\2\u00a1\u00c5\u00ca\u00d0\u00d8\u00e1\u00e6\u00ec\u00f1\u00f6\u00fa"+
		"\u00ff\u0103\u0107\u0111\u0119\u0120\u0127\u012b\u0131\u0134\u013d\u0141"+
		"\u0144\u0148\u014d\u0151\u0159\u0162\u0167\u0169\u0172\u0177\u017a\u0181"+
		"\u018b\u0195\u019a\u019f\u01a2\u01a9\u01b2\u01bb\u01bd\u01c6\u01ce\u01d1"+
		"\u01da\u01dd\u01e1\u01e9\u01ee\u01f2\u01f5\u01fb\u01ff\u0204\u020b\u0215"+
		"\u021c\u0221\u0228\u0230\u023c\u0242\u0249\u0250\u025b\u0260\u0268\u026c"+
		"\u026e\u027e\u028b\u0293\u0296\u029a\u029f\u02a3\u02ad\u02b2\u02b9\u02c4"+
		"\u02c6\u02cb\u02d4\u02da\u02e1\u02ea\u02f5\u02f8\u02ff\u0307\u0311\u0319"+
		"\u031c\u031f\u032a\u0330\u0338\u033e\u0342\u0346\u034a\u034c\u0352\u035a"+
		"\u0365\u036e\u038b\u0394\u0399\u03a3\u03ad\u03b2\u03b9\u03bd\u03c1\u03c3"+
		"\u03ca\u03d2\u03de\u03e2\u03e7\u03f3\u03f9\u0401\u0406\u0413\u0417\u041b"+
		"\u041f\u0421\u0425\u042a\u043d\u0451\u0461\u046b\u0494\u04a8\u04b1\u04ba"+
		"\u04c7\u04cf\u04d1\u04e3\u04ec\u04ee\u04f5\u04fc\u0500\u0503\u0508\u0517"+
		"\u0524\u052b\u052e\u0532\u053a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}