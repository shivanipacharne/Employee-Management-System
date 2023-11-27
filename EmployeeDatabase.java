package Oops_Concept;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDatabase {
	public int registerShivani(ServeletBean shivani)throws ClassNotFoundException 
	{
		String INSERT_USERS_SQL="INSERT INTO shivani"
		+ " (firstname,middlename,lastname,address,mobileno,education,email,Salary)VALUES" 
		+ "(?,?,?,?,?,?,?,?);";
		int result=0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/shivani","root","shivani");
			
				PreparedStatement preparedStatement=connection.prepareStatement(INSERT_USERS_SQL))
		{
			      
			
			      
				    preparedStatement.setString(1,shivani.getFirstName());
					preparedStatement.setString(2,shivani.getMiddleName());
					preparedStatement.setString(3,shivani.getLastName());
					preparedStatement.setString(4,shivani.getAddress());
					preparedStatement.setString(5,shivani.getMobileNo());
					preparedStatement.setString(6,shivani.getEducation());
					preparedStatement.setString(7,shivani.getEmail());
					preparedStatement.setString(8,shivani.getSalary());
					
					System.out.println(preparedStatement);
		            // Step 3: Execute the query or update query
		            result = preparedStatement.executeUpdate();

		        } catch (SQLException e) {
		            // process sql exception
		            printSQLException(e);
		        }
		        return result;
		    }

		    private void printSQLException(SQLException ex) {
		        for (Throwable e: ex) {
		            if (e instanceof SQLException) {
		                e.printStackTrace(System.err);
		                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
		                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
		                System.err.println("Message: " + e.getMessage());
		                Throwable t = ex.getCause();
		                while (t != null) {
		                    System.out.println("Cause: " + t);
		                    t = t.getCause();
		                }
		            }
		        }
		    }
		}

	







