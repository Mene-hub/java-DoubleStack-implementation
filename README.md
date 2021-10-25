<h1>
DoubleStack ds = new DoubleStuck(int length);
</h1>
<p>
  To create a DoubleStack object you need the lenght of the array
  this value have to be greater than zero
</p>

<br/>

<h1>
ds.addRight(int value);
</h1>
<p>
  add the <b>value</b> in the last position on the right
</p>

<br/>

<h1>
ds.delRight();
</h1>
<p>
  delete the last value in the Stack
</p>

<br/>

<h1>
ds.frontRight();
</h1>
<p>
  return the last int value on the right
</p>

<br/>

<h1>
ds.addLeft(int value);
</h1>
<p>
  add the <b>value</b> in the first position on the left
</p>

<br/>

<h1>
ds.delLeft();
</h1>
<p>
  delete the first value in the Stack
</p>

<br/>

<h1>
ds.frontLeft();
</h1>
<p>
  return the first int value on the left
</p>

<br/>

<h1>
ds.isEmpty();
</h1>
<p>
  this method return:
     <ul>
        <li><b>true:</b>  if the array is complitly full <b>[1, 2]</b></li>
        <li><b>false:</b> if the array is not full <b>[null, null], [1, null]</b></li>
     </ul>
</p>

<br/>

<h1>
ds.isFull();
</h1>
<p>
  this method return:
     <ul>
        <li><b>true:</b>  if the array is complitly full <b>[1, 2]</b></li>
        <li><b>false:</b> if the array is not full <b>[null, null], [1, null]</b></li>
     </ul>
</p>

<br/>

<h1>
ds.cardinality();
</h1>
<p>
  this method return the number of assigned value
     <ul>
        <li><b>2:</b>[1, 2, null]</li>
        <li><b>1:</b>[1, null, null]</li>
    </ul>
</p>

<br/>

<h1>
ds.clear();
</h1>
<p>
  reset the DoubleStack to deafault
</p>

<br/>
