interface IDoubleStack 
{
    /**
     * add the <b>value</b> in the stack, in the first position on the left
     * @param value int value
     */
    public void addLeft(int value);

    /**
     * delete the firts value in the Stack
     */
    public void delLeft();

    /**
     * return the fisrt int value on the left
     * @return int
     */
    public int fronLeft();

    /**
     * add the <b>value</b> in the stack, in the last position on the right
     * @param value int value
     */
    public void addRight(int value);

    /**
     * delete the last value in the Stack
     */
    public void delRight();

    /**
     * return the last int value on the right
     * @return int
     */
    public int frontRight();

    /**
     * this method return:
     * <ul>
     *  <li><b>true:</b>  if the array is empty <b>[null, null]</b></li>
     *  <li><b>false:</b> if the array is not empty <b>[1, null], [1, 2]</b></li>
     * </ul>
     * @return boolean
     */
    public boolean isEmpty();

    /**
     * this method return:
     * <ul>
     *  <li><b>true:</b>  if the array is complitly full <b>[1, 2]</b></li>
     *  <li><b>false:</b> if the array is not full <b>[null, null], [1, null]</b></li>
     * </ul>
     * @return boolean
     */
    public boolean isFull();

    /**
     * return the number of assigned value
     * <ul>
     *  <li><b>2:</b>[1, 2, null]</li>
     *  <li><b>1:</b>[1, null, null]</li>
     * </ul>
     * @return int
     */
    public int cardinality();

    /**
     * reset the DoubleStack to deafault
     */
    public void clear();
}