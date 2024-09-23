public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Alex Johnson", "alexjohnson@icloud.com", 'm');
        System.out.println(author);
        author.setEmail("alex_1_johnson@icloud.com");
        System.out.println(author);
    }
}
