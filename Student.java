class Student
{
    private int id;
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public static void main(String args[]){  
        Student s = new Student(); 
        s.setId(10);     
        int res = s.getId();       
        System.out.println(res);
    }
}