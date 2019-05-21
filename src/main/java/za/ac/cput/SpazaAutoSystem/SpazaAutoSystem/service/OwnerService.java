package za.ac.cput.SpazaAutoSystem.SpazaAutoSystem.service;



import za.ac.cput.SpazaAutoSystem.SpazaAutoSystem.domain.People.Owner;

import java.util.Map;

public interface OwnerService extends IService<Owner, String>
{
    //Map<String,Owner> getAllMTMAirtimes();
    Map<String,Owner> getAll();
}
