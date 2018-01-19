package com.fengdai.qa.testMemory;
import org.inferred.freebuilder.FreeBuilder;

@FreeBuilder
public interface Person {
  /** Returns the person's full (English) name. */
  String name();
  /** Returns the person's age in years, rounded down. */
  int age();
  /** Builder of {@link Person} instances. */
  class Builder extends Person_Builder { }
}