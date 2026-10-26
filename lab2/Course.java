public class Course{
	
	private String coursename;
	private String courseId;
	private int credit;
	private int count=0;
	
	public Course(String coursename,String courseId,int credit){
		this.coursename=coursename;
		this.courseId=courseId;
		this.credit=credit;
	}
	
    public String getCoursename(){
	  return coursename;
    }
	public String getCourseId(){
		return courseId;
	}
	public int getCredit(){
		totalEnrollCredit();
		return credit;
	}
	public int totalEnrollCredit(){
		count++;
	}
	public void showCourse(){
		System.out.pritnln("CourseNAme is : "+coursename);
		System.out.pritnln("CourseId is : "+courseId);
		System.out.pritnln("Credit Number is : "+credit);
		System.out.println("Total credit : "+count);
	}
}