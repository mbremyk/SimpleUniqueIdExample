/**
 * Person.java
 * <p>
 * En helt basic klasse med gettere og en equals-metode
 * </p>
 */

public class Person
{
    private int id;
    private String fornavn;
    private String etternavn;

    public Person(int id, String fornavn, String etternavn)
    {
        this.id = id;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
    }

    public int getId()
    {
        return id;
    }

    public String getFornavn()
    {
        return fornavn;
    }

    public String getEtternavn()
    {
        return etternavn;
    }

    public String getNavn()
    {
        return this.etternavn + ", " + this.fornavn;
    }

    public Person copy()
    {
        return new Person(this.id, this.fornavn, this.etternavn);
    }

    /**
     * Sjekker om id er like i de to objektene. På grunn av implementasjonen i PersonRegister vil det aldri skje, men
     * det er fortsatt fornuftig å ha en sjekk.
     * Kunne også sjekket andre attributter, men id er for øyeblikket det eneste som kan identifisere en person entydig
     *
     * @param o Object til sammenlikning
     * @return true hvis det er samme objekt eller hvis Person.id er like, false ellers
     */
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getId() == person.getId();
    }

    @Override
    public String toString()
    {
        return "Person{" + "id=" + id + ", navn='" + this.getNavn() + '\'' + '}';
    }
}
