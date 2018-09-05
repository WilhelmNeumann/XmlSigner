package com.integriks.smev.nwxRewrite.client.src.clientApi.services.signature.configuration;

import com.integriks.smev.nwxRewrite.client.src.clientApi.configuration.SMEVConfiguration;

import java.io.File;

/**
 * Конфигурация сервиса электронной подписи
 */
public interface SignerConfiguration extends SMEVConfiguration {

    /**
     * Возвращает сконфигурированное название провайдера криптографических алгоритмов
     *
     * @return название провайдера криптографических алгоритмов
     */
    String getProviderName();

    /**
     * Возвращает сконфигурированный псевдоним сертификата
     *
     * @return псевдоним сертификата
     */
    String getCertificateAlias();

    /**
     * Возвращает сконфигурированный псевдоним закрытого ключа
     *
     * @return псевдоним закрытого ключа
     */
    String getPrivateKeyAlias();

    /**
     * Возвращает сконфигурированный пароль закрытого ключа
     *
     * @return пароль закрытого ключа
     */
    String getPrivateKeyPassword();

    /**
     * Возвращает сконфигурированную директорию, в которой расположены сертификаты СМЭВ
     *
     * @return директорию, в которой расположены сертификаты СМЭВ
     */
    File getSMEVFileCertificateStore();
}
