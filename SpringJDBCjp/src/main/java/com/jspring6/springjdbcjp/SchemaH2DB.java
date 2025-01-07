package com.jspring6.springjdbcjp;

public class SchemaH2DB {
    public void Schemah2db(){

        System.out.println("Schema H2DB");
    }
}


// If we Using the H2  DB create the Schema as Below : 

// to create the schema we have to create it in the resource folder 
// schema.sql for the schema and data.sql for the data 


//2.  Row Maper Implementation 

// / Finding the Query result set data Using the Rowmapper 

//     public List<Student> findAll() {

//          String sql = "select * from students";
         
// // Using the RowMapper and Annonymous Class 
//         // // execute
//         // // RowMapper
//         // RowMapper<Student> mapper = new RowMapper<Student>() {  // Rowmapper is interface and implement the mapRow and return the one row at a time 

//         //     @Override
//         //     public Student mapRow(@NonNull ResultSet rs, int rowNum) throws SQLException{
//         //         Student s = new Student();
//         //         s.setRollno(rs.getInt("rollno"));
//         //         s.setName(rs.getString("name"));
//         //         s.setMarks(rs.getInt("marks"));
//         //         return s;

                
//         //     }          
            
//         // };
//         // return jdbc.query(sql, mapper); // sql(query) and obj of the rowmapper , return the list of students 

//         // List<Student> students = new ArrayList<>();
//         // return students;

// // Using the lambda Expression    

//         return jdbc.query(sql, (rs, rowNum) -> {  // herer resulset is mapper which has the rs and rowNum
//             Student s = new Student();
//                 s.setRollno(rs.getInt("rollno"));
//                 s.setName(rs.getString("name"));
//                 s.setMarks(rs.getInt("marks"));
//                 return s;   
//         });

