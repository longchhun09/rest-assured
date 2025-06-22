import io.restassured.path.json.JsonPath;
import files.payload;

public class ComplexCourses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JsonPath js = new JsonPath(payload.PlaceCourses());
		
		// Print No of courses returned by API
		int count = js.getInt("courses.size()");
		System.out.println(count);
		
		// Print Purchase Amount
		int totalAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println(totalAmount);
		
		// Print Title of the first course
		String titleFirstCourse = js.get("courses[0].title");
		System.out.println(titleFirstCourse);
		
		// Print All course titles and their respective Prices
		for(int i = 0; i < count; i++) {
			String courseTitles = js.get("courses["+i+"].title");
			System.out.println(js.get("courses["+i+"].price").toString());
			System.out.println(courseTitles);
		}
		
		// Print Number of copies sold by RPA Course
		System.out.println("Print no of copies sold by RPA Course");
		for(int i = 0; i < count; i++) {
			String courseTitles = js.get("courses["+i+"].title");
			if(courseTitles.equalsIgnoreCase("RPA")) {
				// copies sold
				int copies = js.get("courses["+i+"].copies");
				System.out.println(copies);
				break;
			}
		}
		
		// Call SumValidation test
		System.out.println("\n=== Running Sum Validation Test ===");
		SumValidation sumValidation = new SumValidation();
		sumValidation.validateSum();
	}

}
