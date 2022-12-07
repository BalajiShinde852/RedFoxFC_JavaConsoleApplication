public class UserServiceTest {
    

    User user1 = new User("user1", "12345678", "First User", 22, 0, 0, false, LocalDate.now());
	User user2 = new User("user2", "12345678", "Second User", 22, 0, 0, false, LocalDate.now());
	User user3 = new User("user3", "12345678", "Third User", 22, 0, 0, false, LocalDate.now());
	User user4 = new User("user4", "12345678", "Forth User", 22, 0, 0, false, LocalDate.now());
	User user5 = new User("user5", "12345678", "Fifth User", 22, 0, 0, false, LocalDate.now());

	User user = new User();

	List<User> users = new ArrayList<>();

    @BeforeClass
    public void load(){
        users.addAll(Arrays.asList(user1, user2, user3, user4, user5));
    }

    @Test
    public void displayAllUsersTest() {

        assertEquals(users.forEach(u -> System.out.println(u)),new UserService().displayAllUsers());
    }

    @Test
    public void displaySpecificUsersTest() {

        assertEquals(user1.toString(),new UserService().displaySpecificUsers("user1"));
    }
}