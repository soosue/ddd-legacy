package stringaddcalculator;

public class Operand {
    private static final String NEGATIVE_VALUE_EXCEPTION_MESSAGE = "Operand는 음수일 수 없습니다. 현재 값: ";
    private final int number;

    public Operand(int number) {
        if (number < 0) {
            throw new IllegalArgumentException(NEGATIVE_VALUE_EXCEPTION_MESSAGE + number);
        }
        this.number = number;
    }

    public Operand plus(Operand other) {
        return new Operand(number + other.number);
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Operand operand = (Operand) o;

        return number == operand.number;
    }

    @Override
    public int hashCode() {
        return number;
    }
}
