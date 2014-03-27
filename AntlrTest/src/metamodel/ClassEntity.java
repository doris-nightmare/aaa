package metamodel;

import java.util.List;

public class ClassEntity {
	private String pkgName;
	private String name;
	private String fullName;
	private boolean isInterface;
	private boolean isAbstract;
	
	private int noOfMethod;
	private int noOfAttr;
	
	private List<ClassEntity> extendList;
	private List<ClassEntity> implementList;
	private List<ClassEntity> compositionList;
	
	private List<ClassEntity> delegateList;
	private List<ClassEntity> instantiateList;
	
	
	
}
