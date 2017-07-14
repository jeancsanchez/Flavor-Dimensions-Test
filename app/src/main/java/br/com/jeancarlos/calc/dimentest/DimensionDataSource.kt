package br.com.jeancarlos.calc.dimentest

/**
 * This class represents a DimensionDataSource interface
 * @author Jean Carlos
 * @since 14/07/17
 */

interface DimensionDataSource {

    /**
     * Return the current dimension/flavor String
     */
    fun getDimension(): String
}