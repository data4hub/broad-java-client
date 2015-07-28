package com.rest4hub.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rest4hub.JsonUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

@ApiModel(description = "")
public class Banco {

    private String nomeReduzido = null;
    private String numeroCodigo = null;
    private Boolean participaNaCompe = null;
    private String nomeExtenso = null;
    private Date inicioOperacao = null;
    private InformacaAdicional informacaoAdicional = null;
    private String ispb = null;

    /**
     * Nome reduzido do banco
     *
     */
    @ApiModelProperty(required = true, value = "Nome reduzido do banco")
    @JsonProperty("nomeReduzido")
    public String getNomeReduzido() {
        return nomeReduzido;
    }

    public void setNomeReduzido(String nomeReduzido) {
        this.nomeReduzido = nomeReduzido;
    }

    /**
     * Código do banco no BACEN
     *
     */
    @ApiModelProperty(required = true, value = "Código do banco no BACEN")
    @JsonProperty("numeroCodigo")
    public String getNumeroCodigo() {
        return numeroCodigo;
    }

    public void setNumeroCodigo(String numeroCodigo) {
        this.numeroCodigo = numeroCodigo;
    }

    /**
     * Se participa do Sistema de Compensação de Cheques e Outros Papéis
     *
     */
    @ApiModelProperty(required = true, value = "Se participa do Sistema de Compensação de Cheques e Outros Papéis")
    @JsonProperty("participaNaCompe")
    public Boolean getParticipaNaCompe() {
        return participaNaCompe;
    }

    public void setParticipaNaCompe(Boolean participaNaCompe) {
        this.participaNaCompe = participaNaCompe;
    }

    /**
     * Nome completo do banco
     *
     */
    @ApiModelProperty(required = true, value = "Nome completo do banco")
    @JsonProperty("nomeExtenso")
    public String getNomeExtenso() {
        return nomeExtenso;
    }

    public void setNomeExtenso(String nomeExtenso) {
        this.nomeExtenso = nomeExtenso;
    }

    /**
     * Data de início da operação
     *
     */
    @ApiModelProperty(required = true, value = "Data de início da operação")
    @JsonProperty("inicioOperacao")
    public Date getInicioOperacao() {
        return inicioOperacao;
    }

    public void setInicioOperacao(Date inicioOperacao) {
        this.inicioOperacao = inicioOperacao;
    }

    /**
     * Informações adicionais
     *
     */
    @ApiModelProperty(value = "Informações adicionais")
    @JsonProperty("informacaoAdicional")
    public InformacaAdicional getInformacaoAdicional() {
        return informacaoAdicional;
    }

    public void setInformacaoAdicional(InformacaAdicional informacaoAdicional) {
        this.informacaoAdicional = informacaoAdicional;
    }

    /**
     *
     */
    @ApiModelProperty(value = "")
    @JsonProperty("ispb")
    public String getIspb() {
        return ispb;
    }

    public void setIspb(String ispb) {
        this.ispb = ispb;
    }

    @Override
    public String toString() {
        return JsonUtil.toString(this);
    }
}
