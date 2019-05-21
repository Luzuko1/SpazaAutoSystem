package za.ac.cput.SpazaAutoSystem.SpazaAutoSystem.factories.people;

import za.ac.cput.SpazaAutoSystem.SpazaAutoSystem.domain.People.Owner;
import za.ac.cput.SpazaAutoSystem.SpazaAutoSystem.util.GenerateIDInt;


public class OwnerFactory
{
    public static Owner getOwner(String ownerName)
    {
        return new Owner.Builder()
                .owner_ID(GenerateIDInt.generateIDInt())
                .ownerName(ownerName)
                .build();
    }
}
