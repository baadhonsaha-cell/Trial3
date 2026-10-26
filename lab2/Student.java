public class Student {
	
	private String name;
	private float cgpa;
	private int creditcomplete;
	private Course [] c;
	private String Sex;
	
	public Student(String name,float cgpa,int creditcomplete,int x){
		this.name=name;
		this.cgpa=cgpa;
		this.creditcomplete=creditcomplete;
		this.c=new Course[x];
	}
	public String getName(){
		return name;
	}
	public float getCgpa(){
		return cgpa;
	}
	public int getCreditcomplete(){
		return creditcomplete;
	}
	public void enrollCourse(Course course){
		for(int i=0;i<c.length;i++){
			if(c[i]!=null){
				c[i]=course;
				break;
			}
		}
	}
	public void showDetails(){
		for(int i=0;i<c.length;i++){
			if(c[i]!=null){
				c[i].showCourse();
			}
		}
	}
}