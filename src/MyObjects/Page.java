package MyObjects;

import java.util.Objects;

public class Page {
    private final int value;
    private boolean referenceBit;

    public Page(int value) {
        this.value = value;
        referenceBit = true;
    }

    public boolean getReferenceBit() {
        return referenceBit;
    }

    public void setReferenceBit(boolean referenceBit) {
        this.referenceBit = referenceBit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Page page = (Page) o;
        return value == page.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

