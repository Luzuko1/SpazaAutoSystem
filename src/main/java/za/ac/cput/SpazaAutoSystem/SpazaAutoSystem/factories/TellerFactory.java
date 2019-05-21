package za.ac.cput.SpazaAutoSystem.SpazaAutoSystem.factories;

import za.ac.cput.SpazaAutoSystem.SpazaAutoSystem.domain.People.Teller;
import za.ac.cput.SpazaAutoSystem.SpazaAutoSystem.util.GenerateIDInt;

public class TellerFactory
{

        public static Teller getTeller( String tellerName)
        {
            return new Teller.Builder()
                    .tellerID(GenerateIDInt.generateIDInt())
                    .tellerName(tellerName).build();
        }
    }

