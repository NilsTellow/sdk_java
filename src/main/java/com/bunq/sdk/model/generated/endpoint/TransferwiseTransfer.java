package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.Amount;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 * Used to create Transferwise payments.
 */
public class TransferwiseTransfer extends BunqModel {

    /**
     * Field constants.
     */
    public static final String FIELD_MONETARY_ACCOUNT_ID = "monetary_account_id";
    public static final String FIELD_RECIPIENT_ID = "recipient_id";

    /**
     * The LabelMonetaryAccount containing the public information of 'this' (party) side of the
     * Payment.
     */
    @Expose
    @SerializedName("alias")
    private LabelMonetaryAccount alias;

    /**
     * The LabelMonetaryAccount containing the public information of the other (counterparty) side
     * of the Payment.
     */
    @Expose
    @SerializedName("counterparty_alias")
    private LabelMonetaryAccount counterpartyAlias;

    /**
     * The status.
     */
    @Expose
    @SerializedName("status")
    private String status;

    /**
     * The subStatus.
     */
    @Expose
    @SerializedName("sub_status")
    private String subStatus;

    /**
     * The status as Transferwise reports it.
     */
    @Expose
    @SerializedName("status_transferwise")
    private String statusTransferwise;

    /**
     * A status to indicatie if Transferwise has an issue with this payment and requires more
     * information.
     */
    @Expose
    @SerializedName("status_transferwise_issue")
    private String statusTransferwiseIssue;

    /**
     * The source amount.
     */
    @Expose
    @SerializedName("amount_source")
    private Amount amountSource;

    /**
     * The target amount.
     */
    @Expose
    @SerializedName("amount_target")
    private Amount amountTarget;

    /**
     * The rate of the payment.
     */
    @Expose
    @SerializedName("rate")
    private String rate;

    /**
     * The reference of the payment.
     */
    @Expose
    @SerializedName("reference")
    private String reference;

    /**
     * The Pay-In reference of the payment.
     */
    @Expose
    @SerializedName("pay_in_reference")
    private String payInReference;

    /**
     * The estimated delivery time.
     */
    @Expose
    @SerializedName("time_delivery_estimate")
    private String timeDeliveryEstimate;

    /**
     * The quote details used to created the payment.
     */
    @Expose
    @SerializedName("quote")
    private TransferwiseQuote quote;

    /**
     * The id of the monetary account the payment should be made from.
     */
    @Expose
    @SerializedName("monetary_account_id_field_for_request")
    private String monetaryAccountIdFieldForRequest;

    /**
     * The id of the target account.
     */
    @Expose
    @SerializedName("recipient_id_field_for_request")
    private String recipientIdFieldForRequest;

    public TransferwiseTransfer() {
        this(null, null);
    }

    public TransferwiseTransfer(String monetaryAccountId) {
        this(monetaryAccountId, null);
    }

    public TransferwiseTransfer(String monetaryAccountId, String recipientId) {
        this.monetaryAccountIdFieldForRequest = monetaryAccountId;
        this.recipientIdFieldForRequest = recipientId;
    }

    /**
     *
     */
    public static TransferwiseTransfer fromJsonReader(JsonReader reader) {
        return fromJsonReader(TransferwiseTransfer.class, reader);
    }

    /**
     * The LabelMonetaryAccount containing the public information of 'this' (party) side of the
     * Payment.
     */
    public LabelMonetaryAccount getAlias() {
        return this.alias;
    }

    public void setAlias(LabelMonetaryAccount alias) {
        this.alias = alias;
    }

    /**
     * The LabelMonetaryAccount containing the public information of the other (counterparty) side
     * of the Payment.
     */
    public LabelMonetaryAccount getCounterpartyAlias() {
        return this.counterpartyAlias;
    }

    public void setCounterpartyAlias(LabelMonetaryAccount counterpartyAlias) {
        this.counterpartyAlias = counterpartyAlias;
    }

    /**
     * The status.
     */
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * The subStatus.
     */
    public String getSubStatus() {
        return this.subStatus;
    }

    public void setSubStatus(String subStatus) {
        this.subStatus = subStatus;
    }

    /**
     * The status as Transferwise reports it.
     */
    public String getStatusTransferwise() {
        return this.statusTransferwise;
    }

    public void setStatusTransferwise(String statusTransferwise) {
        this.statusTransferwise = statusTransferwise;
    }

    /**
     * A status to indicatie if Transferwise has an issue with this payment and requires more
     * information.
     */
    public String getStatusTransferwiseIssue() {
        return this.statusTransferwiseIssue;
    }

    public void setStatusTransferwiseIssue(String statusTransferwiseIssue) {
        this.statusTransferwiseIssue = statusTransferwiseIssue;
    }

    /**
     * The source amount.
     */
    public Amount getAmountSource() {
        return this.amountSource;
    }

    public void setAmountSource(Amount amountSource) {
        this.amountSource = amountSource;
    }

    /**
     * The target amount.
     */
    public Amount getAmountTarget() {
        return this.amountTarget;
    }

    public void setAmountTarget(Amount amountTarget) {
        this.amountTarget = amountTarget;
    }

    /**
     * The rate of the payment.
     */
    public String getRate() {
        return this.rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    /**
     * The reference of the payment.
     */
    public String getReference() {
        return this.reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * The Pay-In reference of the payment.
     */
    public String getPayInReference() {
        return this.payInReference;
    }

    public void setPayInReference(String payInReference) {
        this.payInReference = payInReference;
    }

    /**
     * The estimated delivery time.
     */
    public String getTimeDeliveryEstimate() {
        return this.timeDeliveryEstimate;
    }

    public void setTimeDeliveryEstimate(String timeDeliveryEstimate) {
        this.timeDeliveryEstimate = timeDeliveryEstimate;
    }

    /**
     * The quote details used to created the payment.
     */
    public TransferwiseQuote getQuote() {
        return this.quote;
    }

    public void setQuote(TransferwiseQuote quote) {
        this.quote = quote;
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        if (this.alias != null) {
            return false;
        }

        if (this.counterpartyAlias != null) {
            return false;
        }

        if (this.status != null) {
            return false;
        }

        if (this.subStatus != null) {
            return false;
        }

        if (this.statusTransferwise != null) {
            return false;
        }

        if (this.statusTransferwiseIssue != null) {
            return false;
        }

        if (this.amountSource != null) {
            return false;
        }

        if (this.amountTarget != null) {
            return false;
        }

        if (this.rate != null) {
            return false;
        }

        if (this.reference != null) {
            return false;
        }

        if (this.payInReference != null) {
            return false;
        }

        if (this.timeDeliveryEstimate != null) {
            return false;
        }

        if (this.quote != null) {
            return false;
        }

        return true;
    }

}
