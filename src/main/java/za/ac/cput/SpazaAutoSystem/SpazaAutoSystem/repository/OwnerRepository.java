package za.ac.cput.SpazaAutoSystem.SpazaAutoSystem.repository;

import za.ac.cput.SpazaAutoSystem.SpazaAutoSystem.domain.People.Owner;


import java.util.Map;

public interface OwnerRepository extends IRepository<Owner, String>
{
    Map<String,Owner> getAll();
}
