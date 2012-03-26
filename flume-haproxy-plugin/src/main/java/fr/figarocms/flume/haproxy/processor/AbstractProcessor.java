package fr.figarocms.flume.haproxy.processor;

import com.cloudera.flume.core.Event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.figarocms.flume.haproxy.exception.ProcessorException;

abstract public class AbstractProcessor implements Processor {

  static final Logger LOG = LoggerFactory.getLogger(AbstractProcessor.class);
  static protected final String prefix = "haproxy.";

  public abstract void doProcess(Event e, String s, String token) throws ProcessorException;

}
