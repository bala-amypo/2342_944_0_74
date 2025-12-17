@Autowired StudentRepo repo
@Override
public StudentEntity postdata(StudentEntity stu){
    return repo.save(stu);
}
@Overridepublic 
public List<StudentEntity> getdata(){
    return 
}