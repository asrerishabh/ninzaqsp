import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider1 {
@Test(dataProvider="login")
	public void login(String username,String password)
	{
		System.out.println("username "+username +"pw "+password );
	}

@DataProvider()
	Object [][]login(){
		Object[][] obj=new Object[2][2];
		obj[0][0]="rishabh";
		obj[0][1]="asre";
		obj[1][0]="east";
		obj[0][1]="west";
		return obj;
	}
		

{
	
}

}
