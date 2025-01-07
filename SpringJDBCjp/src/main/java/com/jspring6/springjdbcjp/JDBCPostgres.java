package com.jspring6.springjdbcjp;

public class JDBCPostgres {
    public void PostgresDB()
    {
        System.out.println(" JDBC Postgres ");
    }
}

// Postgres  SQl Config 


// spring.datasource.url= jdbc:postgresql://localhost:5432/jdatabase
// spring.datasource.username=user1
// spring.datasource.password=pass1
// spring.datasource.driver-class-name=org.postgresql.Driver


// spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
// spring.jpa.hibernate.ddl-auto=update

// # This will execute schema.sql and data.sql
// spring.sql.init.mode=always



// Implentation in repo

/*
 * 
 * 
 * 
@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;  // jdbc template 

    public void save(Student s) {
       // System.out.println("Added.. ");
        
       // throw new UnsupportedOperationException("Unimplemented method 'save'");

// jdbc data execution 

        // query 
        String query1 = "insert into students1 (rollno, name, marks) values(?,?,?)";

       int rows = jdbc.update(query1 , s.getRollno(), s.getName(), s.getMarks()); //  putting the value in the place of ? parmeter
       System.out.println(rows + " rows affected ");

    }

// Finding the Query result set data Using the Rowmapper 

    public List<Student> findAll() {

         String sql = "select * from students1";

// Using the RowMapper and Annonymous Class 
        // // execute
        // RowMapper
        RowMapper<Student> mapper = new RowMapper<Student>() {  // Rowmapper is interface and implement the mapRow and return the one row at a time 

            @Override
            public Student mapRow(@NonNull ResultSet rs, int rowNum) throws SQLException{
                Student s = new Student();
                s.setRollno(rs.getInt("rollno"));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));
                return s;                
            }          
            
        };
        return jdbc.query(sql, mapper); // sql(query) and obj of the rowmapper , return the list of students1 


// // Using the lambda Expression    

//         return jdbc.query(sql, (rs, rowNum) -> {  // herer resulset is mapper which has the rs and rowNum
//             Student s = new Student();
//                 s.setRollno(rs.getInt("rollno"));
//                 s.setName(rs.getString("name"));
//                 s.setMarks(rs.getInt("marks"));
//                 return s;   
//         });



}

// getter setter Jdbc Template 
    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
}
 * 
 */