
public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(String id) {
        return "Customer [ID=" + id + ", Name=Rohit]";
    }
}
