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
 * Component for communicating with MQTT M2M message brokers using Eclipse Paho
 * MQTT Client.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface PahoEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Paho component.
     */
    public interface PahoEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        public default AdvancedPahoEndpointConsumerBuilder advanced() {
            return (AdvancedPahoEndpointConsumerBuilder) this;
        }
        /**
         * Name of the topic.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default PahoEndpointConsumerBuilder topic(String topic) {
            setProperty("topic", topic);
            return this;
        }
        /**
         * Client will automatically attempt to reconnect to the server if the
         * connection is lost.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        public default PahoEndpointConsumerBuilder autoReconnect(
                boolean autoReconnect) {
            setProperty("autoReconnect", autoReconnect);
            return this;
        }
        /**
         * Client will automatically attempt to reconnect to the server if the
         * connection is lost.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        public default PahoEndpointConsumerBuilder autoReconnect(
                String autoReconnect) {
            setProperty("autoReconnect", autoReconnect);
            return this;
        }
        /**
         * The URL of the MQTT broker.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default PahoEndpointConsumerBuilder brokerUrl(String brokerUrl) {
            setProperty("brokerUrl", brokerUrl);
            return this;
        }
        /**
         * MQTT client identifier.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default PahoEndpointConsumerBuilder clientId(String clientId) {
            setProperty("clientId", clientId);
            return this;
        }
        /**
         * Client connection options.
         * The option is a
         * <code>org.eclipse.paho.client.mqttv3.MqttConnectOptions</code> type.
         * @group common
         */
        public default PahoEndpointConsumerBuilder connectOptions(
                Object connectOptions) {
            setProperty("connectOptions", connectOptions);
            return this;
        }
        /**
         * Client connection options.
         * The option will be converted to a
         * <code>org.eclipse.paho.client.mqttv3.MqttConnectOptions</code> type.
         * @group common
         */
        public default PahoEndpointConsumerBuilder connectOptions(
                String connectOptions) {
            setProperty("connectOptions", connectOptions);
            return this;
        }
        /**
         * Base directory used by the file persistence provider.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default PahoEndpointConsumerBuilder filePersistenceDirectory(
                String filePersistenceDirectory) {
            setProperty("filePersistenceDirectory", filePersistenceDirectory);
            return this;
        }
        /**
         * Password to be used for authentication against the MQTT broker.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default PahoEndpointConsumerBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * Client persistence to be used - memory or file.
         * The option is a
         * <code>org.apache.camel.component.paho.PahoPersistence</code> type.
         * @group common
         */
        public default PahoEndpointConsumerBuilder persistence(
                PahoPersistence persistence) {
            setProperty("persistence", persistence);
            return this;
        }
        /**
         * Client persistence to be used - memory or file.
         * The option will be converted to a
         * <code>org.apache.camel.component.paho.PahoPersistence</code> type.
         * @group common
         */
        public default PahoEndpointConsumerBuilder persistence(
                String persistence) {
            setProperty("persistence", persistence);
            return this;
        }
        /**
         * Client quality of service level (0-2).
         * The option is a <code>int</code> type.
         * @group common
         */
        public default PahoEndpointConsumerBuilder qos(int qos) {
            setProperty("qos", qos);
            return this;
        }
        /**
         * Client quality of service level (0-2).
         * The option will be converted to a <code>int</code> type.
         * @group common
         */
        public default PahoEndpointConsumerBuilder qos(String qos) {
            setProperty("qos", qos);
            return this;
        }
        /**
         * Define if you don't want to resolve the MQTT Connect Options from
         * registry.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        public default PahoEndpointConsumerBuilder resolveMqttConnectOptions(
                boolean resolveMqttConnectOptions) {
            setProperty("resolveMqttConnectOptions", resolveMqttConnectOptions);
            return this;
        }
        /**
         * Define if you don't want to resolve the MQTT Connect Options from
         * registry.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        public default PahoEndpointConsumerBuilder resolveMqttConnectOptions(
                String resolveMqttConnectOptions) {
            setProperty("resolveMqttConnectOptions", resolveMqttConnectOptions);
            return this;
        }
        /**
         * Retain option.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        public default PahoEndpointConsumerBuilder retained(boolean retained) {
            setProperty("retained", retained);
            return this;
        }
        /**
         * Retain option.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        public default PahoEndpointConsumerBuilder retained(String retained) {
            setProperty("retained", retained);
            return this;
        }
        /**
         * Username to be used for authentication against the MQTT broker.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default PahoEndpointConsumerBuilder userName(String userName) {
            setProperty("userName", userName);
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
        public default PahoEndpointConsumerBuilder bridgeErrorHandler(
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
        public default PahoEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Paho component.
     */
    public interface AdvancedPahoEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        public default PahoEndpointConsumerBuilder basic() {
            return (PahoEndpointConsumerBuilder) this;
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
        public default AdvancedPahoEndpointConsumerBuilder exceptionHandler(
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
        public default AdvancedPahoEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        public default AdvancedPahoEndpointConsumerBuilder exchangePattern(
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
        public default AdvancedPahoEndpointConsumerBuilder exchangePattern(
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
        public default AdvancedPahoEndpointConsumerBuilder basicPropertyBinding(
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
        public default AdvancedPahoEndpointConsumerBuilder basicPropertyBinding(
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
        public default AdvancedPahoEndpointConsumerBuilder synchronous(
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
        public default AdvancedPahoEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Paho component.
     */
    public static interface PahoEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        public default AdvancedPahoEndpointProducerBuilder advanced() {
            return (AdvancedPahoEndpointProducerBuilder) this;
        }
        /**
         * Name of the topic.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default PahoEndpointProducerBuilder topic(String topic) {
            setProperty("topic", topic);
            return this;
        }
        /**
         * Client will automatically attempt to reconnect to the server if the
         * connection is lost.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        public default PahoEndpointProducerBuilder autoReconnect(
                boolean autoReconnect) {
            setProperty("autoReconnect", autoReconnect);
            return this;
        }
        /**
         * Client will automatically attempt to reconnect to the server if the
         * connection is lost.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        public default PahoEndpointProducerBuilder autoReconnect(
                String autoReconnect) {
            setProperty("autoReconnect", autoReconnect);
            return this;
        }
        /**
         * The URL of the MQTT broker.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default PahoEndpointProducerBuilder brokerUrl(String brokerUrl) {
            setProperty("brokerUrl", brokerUrl);
            return this;
        }
        /**
         * MQTT client identifier.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default PahoEndpointProducerBuilder clientId(String clientId) {
            setProperty("clientId", clientId);
            return this;
        }
        /**
         * Client connection options.
         * The option is a
         * <code>org.eclipse.paho.client.mqttv3.MqttConnectOptions</code> type.
         * @group common
         */
        public default PahoEndpointProducerBuilder connectOptions(
                Object connectOptions) {
            setProperty("connectOptions", connectOptions);
            return this;
        }
        /**
         * Client connection options.
         * The option will be converted to a
         * <code>org.eclipse.paho.client.mqttv3.MqttConnectOptions</code> type.
         * @group common
         */
        public default PahoEndpointProducerBuilder connectOptions(
                String connectOptions) {
            setProperty("connectOptions", connectOptions);
            return this;
        }
        /**
         * Base directory used by the file persistence provider.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default PahoEndpointProducerBuilder filePersistenceDirectory(
                String filePersistenceDirectory) {
            setProperty("filePersistenceDirectory", filePersistenceDirectory);
            return this;
        }
        /**
         * Password to be used for authentication against the MQTT broker.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default PahoEndpointProducerBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * Client persistence to be used - memory or file.
         * The option is a
         * <code>org.apache.camel.component.paho.PahoPersistence</code> type.
         * @group common
         */
        public default PahoEndpointProducerBuilder persistence(
                PahoPersistence persistence) {
            setProperty("persistence", persistence);
            return this;
        }
        /**
         * Client persistence to be used - memory or file.
         * The option will be converted to a
         * <code>org.apache.camel.component.paho.PahoPersistence</code> type.
         * @group common
         */
        public default PahoEndpointProducerBuilder persistence(
                String persistence) {
            setProperty("persistence", persistence);
            return this;
        }
        /**
         * Client quality of service level (0-2).
         * The option is a <code>int</code> type.
         * @group common
         */
        public default PahoEndpointProducerBuilder qos(int qos) {
            setProperty("qos", qos);
            return this;
        }
        /**
         * Client quality of service level (0-2).
         * The option will be converted to a <code>int</code> type.
         * @group common
         */
        public default PahoEndpointProducerBuilder qos(String qos) {
            setProperty("qos", qos);
            return this;
        }
        /**
         * Define if you don't want to resolve the MQTT Connect Options from
         * registry.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        public default PahoEndpointProducerBuilder resolveMqttConnectOptions(
                boolean resolveMqttConnectOptions) {
            setProperty("resolveMqttConnectOptions", resolveMqttConnectOptions);
            return this;
        }
        /**
         * Define if you don't want to resolve the MQTT Connect Options from
         * registry.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        public default PahoEndpointProducerBuilder resolveMqttConnectOptions(
                String resolveMqttConnectOptions) {
            setProperty("resolveMqttConnectOptions", resolveMqttConnectOptions);
            return this;
        }
        /**
         * Retain option.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        public default PahoEndpointProducerBuilder retained(boolean retained) {
            setProperty("retained", retained);
            return this;
        }
        /**
         * Retain option.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        public default PahoEndpointProducerBuilder retained(String retained) {
            setProperty("retained", retained);
            return this;
        }
        /**
         * Username to be used for authentication against the MQTT broker.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default PahoEndpointProducerBuilder userName(String userName) {
            setProperty("userName", userName);
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
        public default PahoEndpointProducerBuilder lazyStartProducer(
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
        public default PahoEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Paho component.
     */
    public interface AdvancedPahoEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        public default PahoEndpointProducerBuilder basic() {
            return (PahoEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedPahoEndpointProducerBuilder basicPropertyBinding(
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
        public default AdvancedPahoEndpointProducerBuilder basicPropertyBinding(
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
        public default AdvancedPahoEndpointProducerBuilder synchronous(
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
        public default AdvancedPahoEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Paho component.
     */
    public static interface PahoEndpointBuilder
            extends
                PahoEndpointConsumerBuilder, PahoEndpointProducerBuilder {
        public default AdvancedPahoEndpointBuilder advanced() {
            return (AdvancedPahoEndpointBuilder) this;
        }
        /**
         * Name of the topic.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default PahoEndpointBuilder topic(String topic) {
            setProperty("topic", topic);
            return this;
        }
        /**
         * Client will automatically attempt to reconnect to the server if the
         * connection is lost.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        public default PahoEndpointBuilder autoReconnect(boolean autoReconnect) {
            setProperty("autoReconnect", autoReconnect);
            return this;
        }
        /**
         * Client will automatically attempt to reconnect to the server if the
         * connection is lost.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        public default PahoEndpointBuilder autoReconnect(String autoReconnect) {
            setProperty("autoReconnect", autoReconnect);
            return this;
        }
        /**
         * The URL of the MQTT broker.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default PahoEndpointBuilder brokerUrl(String brokerUrl) {
            setProperty("brokerUrl", brokerUrl);
            return this;
        }
        /**
         * MQTT client identifier.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default PahoEndpointBuilder clientId(String clientId) {
            setProperty("clientId", clientId);
            return this;
        }
        /**
         * Client connection options.
         * The option is a
         * <code>org.eclipse.paho.client.mqttv3.MqttConnectOptions</code> type.
         * @group common
         */
        public default PahoEndpointBuilder connectOptions(Object connectOptions) {
            setProperty("connectOptions", connectOptions);
            return this;
        }
        /**
         * Client connection options.
         * The option will be converted to a
         * <code>org.eclipse.paho.client.mqttv3.MqttConnectOptions</code> type.
         * @group common
         */
        public default PahoEndpointBuilder connectOptions(String connectOptions) {
            setProperty("connectOptions", connectOptions);
            return this;
        }
        /**
         * Base directory used by the file persistence provider.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default PahoEndpointBuilder filePersistenceDirectory(
                String filePersistenceDirectory) {
            setProperty("filePersistenceDirectory", filePersistenceDirectory);
            return this;
        }
        /**
         * Password to be used for authentication against the MQTT broker.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default PahoEndpointBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * Client persistence to be used - memory or file.
         * The option is a
         * <code>org.apache.camel.component.paho.PahoPersistence</code> type.
         * @group common
         */
        public default PahoEndpointBuilder persistence(
                PahoPersistence persistence) {
            setProperty("persistence", persistence);
            return this;
        }
        /**
         * Client persistence to be used - memory or file.
         * The option will be converted to a
         * <code>org.apache.camel.component.paho.PahoPersistence</code> type.
         * @group common
         */
        public default PahoEndpointBuilder persistence(String persistence) {
            setProperty("persistence", persistence);
            return this;
        }
        /**
         * Client quality of service level (0-2).
         * The option is a <code>int</code> type.
         * @group common
         */
        public default PahoEndpointBuilder qos(int qos) {
            setProperty("qos", qos);
            return this;
        }
        /**
         * Client quality of service level (0-2).
         * The option will be converted to a <code>int</code> type.
         * @group common
         */
        public default PahoEndpointBuilder qos(String qos) {
            setProperty("qos", qos);
            return this;
        }
        /**
         * Define if you don't want to resolve the MQTT Connect Options from
         * registry.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        public default PahoEndpointBuilder resolveMqttConnectOptions(
                boolean resolveMqttConnectOptions) {
            setProperty("resolveMqttConnectOptions", resolveMqttConnectOptions);
            return this;
        }
        /**
         * Define if you don't want to resolve the MQTT Connect Options from
         * registry.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        public default PahoEndpointBuilder resolveMqttConnectOptions(
                String resolveMqttConnectOptions) {
            setProperty("resolveMqttConnectOptions", resolveMqttConnectOptions);
            return this;
        }
        /**
         * Retain option.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        public default PahoEndpointBuilder retained(boolean retained) {
            setProperty("retained", retained);
            return this;
        }
        /**
         * Retain option.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        public default PahoEndpointBuilder retained(String retained) {
            setProperty("retained", retained);
            return this;
        }
        /**
         * Username to be used for authentication against the MQTT broker.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        public default PahoEndpointBuilder userName(String userName) {
            setProperty("userName", userName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Paho component.
     */
    public static interface AdvancedPahoEndpointBuilder
            extends
                AdvancedPahoEndpointConsumerBuilder, AdvancedPahoEndpointProducerBuilder {
        public default PahoEndpointBuilder basic() {
            return (PahoEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        public default AdvancedPahoEndpointBuilder basicPropertyBinding(
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
        public default AdvancedPahoEndpointBuilder basicPropertyBinding(
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
        public default AdvancedPahoEndpointBuilder synchronous(
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
        public default AdvancedPahoEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.paho.PahoPersistence</code> enum.
     */
    public static enum PahoPersistence {
        FILE, MEMORY;
    }
    /**
     * Component for communicating with MQTT M2M message brokers using Eclipse
     * Paho MQTT Client. Creates a builder to build endpoints for the Paho
     * component.
     */
    public default PahoEndpointBuilder paho(String path) {
        class PahoEndpointBuilderImpl extends AbstractEndpointBuilder implements PahoEndpointBuilder, AdvancedPahoEndpointBuilder {
            public PahoEndpointBuilderImpl(String path) {
                super("paho", path);
            }
        }
        return new PahoEndpointBuilderImpl(path);
    }
}