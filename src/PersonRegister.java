import java.util.ArrayList;

public class PersonRegister
{
    private ArrayList<Person> personRegister;
    private int idTeller;

    public PersonRegister()
    {
        this.personRegister = new ArrayList<Person>();
        this.idTeller = 0;
    }

    /**
     * registrerPerson tar to String, fornavn og etternavn, som er de to attributtene som en bruker bryr seg om.
     * PersonRegister har en teller som starter på 0, og som legger til 1 hver gang det legges til en Person.
     * Telleren brukes for å lage id til nye Personer
     * @param fornavn String med fornavnet til personen
     * @param etternavn String med etternavnet til personen
     * @return true hvis personen ble registrert, false hvis den allerede finnes i registeret
     */
    public boolean registrerPerson(String fornavn, String etternavn)
    {
        if (personRegister.contains(new Person(idTeller, fornavn, etternavn))) return false;
        //Her kunne det stått "personRegister.add(new Person(idTeller++, fornavn, etternavn));" istedenfor å ha det på to linjer.
        //Dette gir samme resultat som det som står under
        personRegister.add(new Person(idTeller, fornavn, etternavn));
        idTeller++;
        return true;
    }

    public ArrayList<Person> getPersoner()
    {
        ArrayList<Person> out = new ArrayList<>();
        for (Person p : personRegister)
        {
            out.add(p.copy());
        }
        return out;
    }

    @Override
    public String toString()
    {
        StringBuilder out = new StringBuilder("PersonRegister{" + "idTeller=" + idTeller);
        out.append("\npersonRegister={\n");
        for (Person p : personRegister)
        {
            out.append('\t').append(p).append('\n');
        }
        out.append('}');
        return out.toString();
    }
}
