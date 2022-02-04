package hi;

public class Person
{
	String firstName;
	String lname;
	int age;
	
	/**
	 * @param fname - First Name
	 * @param lname - Last Name
	 * @param age 	- age of person in years
	 */
	public Person(String fname, String lname, int age) throws UnderAgeException
	{
		this.firstName = fname;
		this.lname = lname;
		this.age = age;
	}

	public String getFname()
	{
		return firstName;
	}

	public void setFname(String fname)
	{
		this.firstName = fname;
	}

	public String getLname()
	{
		return lname;
	}

	public void setLname(String lname)
	{
		this.lname = lname;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "Person: " + firstName + " " + lname + ", " + age;
	}
	
	public Person makePerson(Person that) throws UnderAgeException
	{
		if(age<18 || that.age < 18)
		{
			throw new UnderAgeException();
		}
		Person child = new Person(this.firstName,that.lname,0);
		return child;
	}
	
	public static void main(String[] args) throws UnderAgeException
	{
		Person r;
		
		r = new Person("Romeo","Mon",15);
		
		
		
		System.out.println("R "+r);
	}
	
}
