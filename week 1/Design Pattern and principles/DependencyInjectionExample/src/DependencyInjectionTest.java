
public class DependencyInjectionTest {
    public static void main(String[] args) {
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        String customerDetails = service.getCustomerDetails("12345");
        System.out.println(customerDetails);
    }
}
