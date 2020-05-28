public class PersonKlient
{
    public static void main(String[] args)
    {
        PersonRegister personRegister = new PersonRegister();

        personRegister.registrerPerson("Magnus", "Brevik");
        personRegister.registrerPerson("Zaim", "Imran");
        personRegister.registrerPerson("Max", "Schau");

        System.out.println(personRegister);
    }
}
