/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The vertx component is used for sending and receive messages from a vertx
 * event bus.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface VertxEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Vert.x component.
     */
    public interface VertxEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        public default AdvancedVertxEndpointConsumerBuilder advanced() {
            return (AdvancedVertxEndpointConsumerBuilder) this;
        }
        /**
         * Sets the event bus address used to communicate.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default VertxEndpointConsumerBuilder address(String address) {
            setProperty("address", address);
            return this;
        }
        /**
         * Whether to use publish/subscribe instead of point to point when
         * sending to a vertx endpoint.
         * The option is a <code>java.lang.Boolean</code> type.
         * @group common
         */
        public default VertxEndpointConsumerBuilder pubSub(Boolean pubSub) {
            setProperty("pubSub", pubSub);
            return this;
        }
        /**
         * Whether to use publish/subscribe instead of point to point when
         * sending to a vertx endpoint.
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * @group common
         */
        public default VertxEndpointConsumerBuilder pubSub(String pubSub) {
            setProperty("pubSub", pubSub);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        public default VertxEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        public default VertxEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Vert.x component.
     */
    public interface AdvancedVertxEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        public default VertxEndpointConsumerBuilder basic() {
            return (VertxEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option is a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * @group consumer (advanced)
         */
        public default AdvancedVertxEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * @group consumer (advanced)
         */
        public default AdvancedVertxEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public default AdvancedVertxEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public default AdvancedVertxEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedVertxEndpointConsumerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedVertxEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedVertxEndpointConsumerBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedVertxEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Vert.x component.
     */
    public static interface VertxEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        public default AdvancedVertxEndpointProducerBuilder advanced() {
            return (AdvancedVertxEndpointProducerBuilder) this;
        }
        /**
         * Sets the event bus address used to communicate.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default VertxEndpointProducerBuilder address(String address) {
            setProperty("address", address);
            return this;
        }
        /**
         * Whether to use publish/subscribe instead of point to point when
         * sending to a vertx endpoint.
         * The option is a <code>java.lang.Boolean</code> type.
         * @group common
         */
        public default VertxEndpointProducerBuilder pubSub(Boolean pubSub) {
            setProperty("pubSub", pubSub);
            return this;
        }
        /**
         * Whether to use publish/subscribe instead of point to point when
         * sending to a vertx endpoint.
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * @group common
         */
        public default VertxEndpointProducerBuilder pubSub(String pubSub) {
            setProperty("pubSub", pubSub);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        public default VertxEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        public default VertxEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Vert.x component.
     */
    public interface AdvancedVertxEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        public default VertxEndpointProducerBuilder basic() {
            return (VertxEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedVertxEndpointProducerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedVertxEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedVertxEndpointProducerBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedVertxEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Vert.x component.
     */
    public static interface VertxEndpointBuilder
            extends
                VertxEndpointConsumerBuilder, VertxEndpointProducerBuilder {
        public default AdvancedVertxEndpointBuilder advanced() {
            return (AdvancedVertxEndpointBuilder) this;
        }
        /**
         * Sets the event bus address used to communicate.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default VertxEndpointBuilder address(String address) {
            setProperty("address", address);
            return this;
        }
        /**
         * Whether to use publish/subscribe instead of point to point when
         * sending to a vertx endpoint.
         * The option is a <code>java.lang.Boolean</code> type.
         * @group common
         */
        public default VertxEndpointBuilder pubSub(Boolean pubSub) {
            setProperty("pubSub", pubSub);
            return this;
        }
        /**
         * Whether to use publish/subscribe instead of point to point when
         * sending to a vertx endpoint.
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * @group common
         */
        public default VertxEndpointBuilder pubSub(String pubSub) {
            setProperty("pubSub", pubSub);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Vert.x component.
     */
    public static interface AdvancedVertxEndpointBuilder
            extends
                AdvancedVertxEndpointConsumerBuilder, AdvancedVertxEndpointProducerBuilder {
        public default VertxEndpointBuilder basic() {
            return (VertxEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedVertxEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedVertxEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedVertxEndpointBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedVertxEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * The vertx component is used for sending and receive messages from a vertx
     * event bus. Creates a builder to build endpoints for the Vert.x component.
     */
    public default VertxEndpointBuilder vertx(String path) {
        class VertxEndpointBuilderImpl extends AbstractEndpointBuilder implements VertxEndpointBuilder, AdvancedVertxEndpointBuilder {
            public VertxEndpointBuilderImpl(String path) {
                super("vertx", path);
            }
        }
        return new VertxEndpointBuilderImpl(path);
    }
}