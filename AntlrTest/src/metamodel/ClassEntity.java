package metamodel;

import java.util.List;

public class ClassEntity {
	private String pkgName;
	private String name;
	private String fullName;
	private boolean isInterface;
	private boolean isAbstract;
	
	//metrics
	private int noOfMethod;
	private int noOfAttr;
	
	private List<ClassEntity> extendList;
	private List<ClassEntity> implementList;
	private List<ClassEntity> compositionList;
	
	private List<ClassEntity> delegateList;
	private List<ClassEntity> instantiateList;
	
	public void addMethod(){
		this.noOfMethod+=1;
	}
	public void addAttr(){
		this.noOfAttr+=1;
	}
	public ClassEntity(){
		this.noOfAttr=0;
		this.noOfMethod=0;
	}

	public String getPkgName() {
		return pkgName;
	}

	public void setPkgName(String pkgName) {
		this.pkgName = pkgName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Package:"+pkgName+"\n");
		sb.append("Name:"+name+"\n");
		sb.append("Number of Methods:"+noOfMethod+"\n");
		sb.append("Number of Fields:"+noOfAttr+"\n");
		return sb.toString();
		
	}
	
	
	
	
}
