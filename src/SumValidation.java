import io.restassured.path.json.JsonPath;
import files.payload;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumValidation {

	@Test
	public void validateSum() {
		JsonPath js = new JsonPath(payload.PlaceCourses());
		
		// Print No of courses returned by API
		int count = js.getInt("courses.size()");
		System.out.println("Number of courses: " + count);
		
		// Print Purchase Amount
		int totalAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println("Purchase Amount: " + totalAmount);
		
		// Verify if Sum of all Course prices matches with Purchase Amount
		int sum = 0;
		for(int i = 0; i < count; i++) {
			int price = js.getInt("courses["+i+"].price");
			int copies = js.getInt("courses["+i+"].copies");
			int amount = price * copies;
			System.out.println("Course " + (i+1) + " amount: " + amount);
			sum = sum + amount;
		}
		System.out.println("Total sum: " + sum);
		int purchaseAmount = js.getInt("dashboard.purchaseAmount");
		
		// TestNG assertion
		Assert.assertEquals(sum, purchaseAmount, "Sum of all Course prices should match with Purchase Amount");
		System.out.println("✅ Sum validation passed: Sum of all Course prices matches with Purchase Amount");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumValidation test = new SumValidation();
		test.validateSum();
	}

}
