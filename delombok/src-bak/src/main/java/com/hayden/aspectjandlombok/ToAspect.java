package com.hayden.aspectjandlombok;

public class ToAspect {
    private String property;

    public void someFunction() {
    }

    public void someFunction(String args) {
    }

    public void test() {
    }


    public static class ToAspectBuilder {
        private String property;

        ToAspectBuilder() {
        }

        /**
         * @return {@code this}.
         */
        public ToAspect.ToAspectBuilder property(final String property) {
            this.property = property;
            return this;
        }

        public ToAspect build() {
            return new ToAspect(this.property);
        }

        @Override
        public String toString() {
            return "ToAspect.ToAspectBuilder(property=" + this.property + ")";
        }
    }

    public static ToAspect.ToAspectBuilder builder() {
        return new ToAspect.ToAspectBuilder();
    }

    public String getProperty() {
        return this.property;
    }

    public void setProperty(final String property) {
        this.property = property;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ToAspect)) return false;
        final ToAspect other = (ToAspect) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$property = this.getProperty();
        final Object other$property = other.getProperty();
        if (this$property == null ? other$property != null : !this$property.equals(other$property)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ToAspect;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $property = this.getProperty();
        result = result * PRIME + ($property == null ? 43 : $property.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "ToAspect(property=" + this.getProperty() + ")";
    }

    public ToAspect() {
    }

    public ToAspect(final String property) {
        this.property = property;
    }
}
