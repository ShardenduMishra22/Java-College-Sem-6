package appB;

import java.util.Objects;

public record CustomerWithValidation(int id, String name) {
  public CustomerWithValidation {
    if (id < 0) {
      throw new ValidationException();
    }
  }

  @Override
  public boolean equals(Object o) {
    return id == ((CustomerWithValidation) o).id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  private boolean isValidName(String name) {
    // some implementation
    return true;
  }
}
