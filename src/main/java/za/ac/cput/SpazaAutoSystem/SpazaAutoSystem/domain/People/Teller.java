package za.ac.cput.SpazaAutoSystem.SpazaAutoSystem.domain.People;

public class Teller implements PersonName
{
    private Integer tellerID;
    private String tellerName;

    private Teller()
    {
    }

    private Teller(Builder builder)
    {
        this.tellerID = builder.tellerID;
        this.tellerName = builder.tellerName;
    }

    public Integer getTellerID()
    {
        return tellerID;
    }

    public void setTellerID(Integer tellerID)
    {
        this.tellerID = tellerID;
    }

    public String getTellerName()
    {
        return tellerName;
    }

    public void setTellerName(String tellerName)
    {
        this.tellerName = tellerName;
    }

    @Override
    public int getIdValue()
    {
        return 0;
    }

    @Override
    public String getIdType()
    {
        return null;
    }

    public static class Builder{

        private String tellerName;
        private int tellerID;

        public Builder tellerID(int tellerID) {
            this.tellerID = tellerID;
            return this;
        }

        public Builder tellerName(String tellerName) {
            this.tellerName = tellerName;
            return this;
        }

        public Teller build() {
            return new Teller(this);
        }

    }

    @Override
    public String toString()
    {
        return "Teller{" +
                "tellerID='" + tellerID + '\'' +
                ", tellerName='" + tellerName + '\'' +
                '}';
    }
}