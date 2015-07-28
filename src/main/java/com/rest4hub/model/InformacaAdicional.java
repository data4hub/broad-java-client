package com.rest4hub.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rest4hub.JsonUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "")
public class InformacaAdicional {

    private String segmento = null;
    private String endereco = null;
    private String complemento = null;
    private String bairro = null;
    private String cep = null;
    private String municipio = null;
    private String uf = null;
    private String ddd = null;
    private String fone = null;
    private Boolean cartComercial = null;
    private String email = null;
    private String site = null;

    /**
     * Tipo de segmento do banco
     *
     */
    @ApiModelProperty(value = "Tipo de segmento do banco")
    @JsonProperty("segmento")
    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    /**
     * Endereço
     *
     */
    @ApiModelProperty(value = "Endereço")
    @JsonProperty("endereco")
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Complemento do endereço
     *
     */
    @ApiModelProperty(value = "Complemento do endereço")
    @JsonProperty("complemento")
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * Bairro do endereço
     *
     */
    @ApiModelProperty(value = "Bairro do endereço")
    @JsonProperty("bairro")
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * CEP do endereço
     *
     */
    @ApiModelProperty(value = "CEP do endereço")
    @JsonProperty("cep")
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * Município do endereço
     *
     */
    @ApiModelProperty(value = "Município do endereço")
    @JsonProperty("municipio")
    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    /**
     * UF do endereço
     *
     */
    @ApiModelProperty(value = "UF do endereço")
    @JsonProperty("uf")
    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * DDD
     *
     */
    @ApiModelProperty(value = "DDD")
    @JsonProperty("ddd")
    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    /**
     * Telefone
     *
     */
    @ApiModelProperty(value = "Telefone")
    @JsonProperty("fone")
    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    /**
     * Indica se possui carteira comercial
     *
     */
    @ApiModelProperty(value = "Indica se possui carteira comercial")
    @JsonProperty("cartComercial")
    public Boolean getCartComercial() {
        return cartComercial;
    }

    public void setCartComercial(Boolean cartComercial) {
        this.cartComercial = cartComercial;
    }

    /**
     * E-mail
     *
     */
    @ApiModelProperty(value = "E-mail")
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Site
     *
     */
    @ApiModelProperty(value = "Site")
    @JsonProperty("site")
    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    @Override
    public String toString() {
        return JsonUtil.toString(this);
    }
}
