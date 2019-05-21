package za.ac.cput.SpazaAutoSystem.SpazaAutoSystem.service;


import org.springframework.stereotype.Service;
import za.ac.cput.SpazaAutoSystem.SpazaAutoSystem.domain.People.Owner;
import za.ac.cput.SpazaAutoSystem.SpazaAutoSystem.repository.OwnerRepository;
import za.ac.cput.SpazaAutoSystem.SpazaAutoSystem.repository.OwnerRepositoryImpl;

import java.util.Map;

@Service
public class OwnerServiceImpl implements OwnerService
{
    private static OwnerServiceImpl service = null;

    OwnerRepository repository = OwnerRepositoryImpl.getRepository();

    private static OwnerServiceImpl getInstance()
    {
        if(service==null)
            service = new OwnerServiceImpl();
        return service;
    }

   // @Override
    public Map<String, Owner> getAllMTMAirtimes()
    {
        return null;
    }

    @Override
    public Map<String, Owner> getAll()
    {
        return null;
    }

    @Override
    public Owner create(Owner owner)
    {
        return repository.create(owner);
    }

    @Override
    public Owner update(Owner owner)
    {
        return repository.update(owner);
    }

    @Override
    public void delete(String s)
    {
        repository.delete(s);
    }

    @Override
    public Owner read(String s)
    {
        return repository.read(s);
    }
}
