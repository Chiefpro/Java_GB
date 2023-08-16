public class Dz5 {
    public static void main(String[] args) {
        phoneBook phoneBook = new phoneBook();
        phoneBook.add("123456789", "Алиса");
        phoneBook.add("987654321", "Иван");
        phoneBook.add("456789123", "Владимир");
        phoneBook.add("321654987", "Давид");
        phoneBook.add("789123456", "Алексадра");
        phoneBook.add("654987321", "Сергей");
        phoneBook.add("234567891", "Иван");
        phoneBook.add("876543219", "Пётр");
        phoneBook.add("345678912", "Александра");
        phoneBook.add("432165498", "Андрей");
        phoneBook.add("876543219", "Степан");
        phoneBook.add("234567891", "Сергей");
        phoneBook.add("654987321", "Владимир");
        phoneBook.add("435455423", "Владимир");
        phoneBook.add("789123446", "Викторя");
        phoneBook.add("321654987", "Давид");
        phoneBook.add("321654987", "Виталий");
        phoneBook.add("321654987", "Виталий");
        System.out.println(phoneBook.getPhoneNum("654987321"));
        System.out.println(phoneBook.getByName("Давид"));
        System.out.println(phoneBook.getAll());
    }
}