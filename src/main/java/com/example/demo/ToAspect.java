package com.example.demo;

public class ToAspect {

    private String property;

    public ToAspect(String property)
    {
        this.property = property;
    }

    public ToAspect()
    {
    }

    public static ToAspectBuilder builder()
    {
        return new ToAspectBuilder();
    }

    public void someFunction() {}
    public void someFunction(String args) {}


    public String getProperty()
    {
        return this.property;
    }

    public void setProperty(String property)
    {
        this.property = property;
    }

    public boolean equals(final Object o)
    {
        if (o == this) return true;
        if (!(o instanceof ToAspect)) return false;
        final ToAspect other = (ToAspect) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$property = this.getProperty();
        final Object other$property = other.getProperty();
        if (this$property == null
                ? other$property != null
                : !this$property.equals(other$property)) return false;
        return true;
    }

    protected boolean canEqual(final Object other)
    {
        return other instanceof ToAspect;
    }

    public int hashCode()
    {
        final int PRIME = 59;
        int result = 1;
        final Object $property = this.getProperty();
        result = result * PRIME + ($property == null
                ? 43
                : $property.hashCode());
        return result;
    }

    public String toString()
    {
        return "ToAspect(property=" + this.getProperty() + ")";
    }

    public static class ToAspectBuilder {
        private String property;

        ToAspectBuilder()
        {
        }

        public ToAspectBuilder property(String property)
        {
            this.property = property;
            return this;
        }

        public ToAspect build()
        {
            return new ToAspect(property);
        }

        public String toString()
        {
            return "ToAspect.ToAspectBuilder(property=" + this.property + ")";
        }
    }
}