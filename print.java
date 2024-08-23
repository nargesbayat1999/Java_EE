package ir.freeland.spring.initialspring.annotation;

import org.springframework.stereotype.Service;

/**
 * Simple output handler
 *
 * Used only for demonstration purposes :P
 */
@Service
public class print {
  public void doprint(String value) {
    System.out.println(value);
  }
}
