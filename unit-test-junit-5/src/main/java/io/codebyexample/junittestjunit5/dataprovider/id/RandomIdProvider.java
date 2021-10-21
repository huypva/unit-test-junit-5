package io.codebyexample.junittestjunit5.dataprovider.id;

import org.springframework.stereotype.Component;

/**
 * @author huypva
 */
@Component
public class RandomIdProvider implements IdProvider {

  @Override
  public int genId() {
    return 1;
  }
}
