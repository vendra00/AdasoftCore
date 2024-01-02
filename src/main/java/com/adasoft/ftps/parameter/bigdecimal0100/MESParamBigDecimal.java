package com.adasoft.ftps.parameter.bigdecimal0100;

import com.datasweep.compatibility.client.ATRow;
import com.datasweep.compatibility.client.MeasuredValue;
import com.datasweep.compatibility.client.Response;
import com.rockwell.mes.commons.base.ifc.functional.MeasuredValueUtilities;
import com.rockwell.mes.commons.base.ifc.objects.BulkSaveableMESATObject;
import com.rockwell.mes.services.s88.ifc.recipe.IMESProcessParameterData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * <h1>MESParamBigDecimal</h1>
 * <p>
 * A specialized class for handling BigDecimal parameters within MES (Manufacturing Execution System).
 * It extends <code>BulkSaveableMESATObject</code> and implements <code>IMESProcessParameterData</code>,
 * facilitating integration with MES process parameters.
 * </p>
 * <p>
 * The class encapsulates behavior and properties specific to BigDecimal parameters, providing methods
 * for managing and interacting with these data types.
 * </p>
 * <p>
 * <h2>Static Properties</h2>
 * <ul>
 *     <li><strong>ATDEFINITION_NAME</strong>: Static field representing the AT definition name.</li>
 *     <li><strong>PROP_NAME_VALUE</strong>: Static field representing the property name 'value'.</li>
 *     <li><strong>DB_COL_NAME_VALUE</strong>: Static field representing the database column name for 'value'.</li>
 *     <li><strong>COL_NAME_VALUE</strong>: Static field representing the column name 'value'.</li>
 * </ul>
 * <h2>Constructors</h2>
 * <ul>
 *     <li><code>MESParamBigDecimal(long key)</code>: Initializes with a specified key.</li>
 *     <li><code>MESParamBigDecimal(MESParamBigDecimal source)</code>: Copy constructor, creating a new instance from an existing one.</li>
 *     <li><code>MESParamBigDecimal(ATRow baseATRow)</code>: Initializes using an ATRow object.</li>
 *     <li><code>MESParamBigDecimal()</code>: Default constructor.</li>
 * </ul>
 *
 * @author g.vendramini
 *
 */

public class MESParamBigDecimal extends BulkSaveableMESATObject implements IMESProcessParameterData {
    protected static final String ATDEFINITION_NAME = "C_ParamBigDecimal0100";
    public static final String PROP_NAME_VALUE = "value";
    public static final String DB_COL_NAME_VALUE = "C_Value_V";
    public static final String COL_NAME_VALUE = "C_Value";

    /**
     * Gets the AT definition name for this parameter.
     * @return The AT definition name, which is "C_ParamBigDecimal0100".
     */
    public String getATDefinitionName() {
        return "C_ParamBigDecimal0100";
    }

    /**
     * This method is called by the constructor of the class MESParamBigDecimal.
     * @param key the key of the MESParamBigDecimal object. In this case it is the key of the ATRow.
     */
    public MESParamBigDecimal(long key) {
        super(key);
    }

    /**
     * This method is called by the constructor of the class MESParamBigDecimal.
     * @param source the MESParamBigDecimal object to copy. In this case it is the MESParamBigDecimal object to copy.
     */
    public MESParamBigDecimal(MESParamBigDecimal source) {
        super(source);
    }

    /**
     * This method is called by the constructor of the class MESParamBigDecimal.
     * @param baseATRow the ATRow to copy. In this case it is the ATRow to copy.
     */
    public MESParamBigDecimal(ATRow baseATRow) {
        super(baseATRow);
    }

    /**
     * This method is called by the constructor of the class MESParamBigDecimal.
     */
    public MESParamBigDecimal() {
    }

    /**
     * This method is called by the method synchronizeAfterATRowRefresh of the class MESParamBigDecimal.
     */
    protected void synchronizeAfterATRowRefresh() {
        super.synchronizeAfterATRowRefresh();
    }

    /**
     * This method is called by the method getDefaultValue of the class MESParamBigDecimal.
     * @return the default value of the MESParamBigDecimal object. In this case it is the default value of the ATRow.
     */
    public BigDecimal getValue() {
        MeasuredValue mv = (MeasuredValue)this.dgtATRow.getValue("C_Value");
        return mv == null ? null : mv.getValue();
    }

    /**
     * Sets the BigDecimal value of this parameter.
     * This method is responsible for updating the internal value and firing a property change event.
     * @param value The new BigDecimal value to be set.
     */
    public void setValue(BigDecimal value) {
        BigDecimal oldValue = this.getValue();
        MeasuredValue mv = value == null ? null : MeasuredValueUtilities.createMV(value, "");
        this.dgtATRow.setValue("C_Value", mv);
        this.pcs.firePropertyChange("value", oldValue, value);
    }

    /**
     * This method is called by the method prepareATRowForSave of the class MESParamBigDecimal.
     * @param isBulkSave the boolean value to determine if the save is a bulk save. In this case it is the boolean value to determine if the save is a bulk save.
     * @return the response of the MESParamBigDecimal object. In this case it is the response of the ATRow.
     */
    public Response prepareATRowForSave(boolean isBulkSave) {
        Response res = super.prepareATRowForSave(isBulkSave);
        return res;
    }

    /**
     * This method is called by the method getDataAsString of the class MESParamBigDecimal.
     * @return the data as string of the MESParamBigDecimal object. In this case it is the data as string of the ATRow.
     */
    public String getDataAsString() {
        List<Object> result = new ArrayList<>();
        result.add(this.getValue());
        return StringUtils.join(result, ';');
    }

    /**
     * Provides a string representation of this MESParamBigDecimal instance.
     * Mainly used for debugging purposes, it outputs the state of all properties.
     * @return String representation of this instance.
     */
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
