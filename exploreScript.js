var animalArray = [
  {'ID':'1','Species':'Cat','Name':'Layla','Age':'3 Years','Gender':'Female','Weight':'8.0 lbs','Location':'In Foster','IntakeDate':'2/17/2021'},
  {'ID':'2','Species':'Cat','Name':'Shushe','Age':'3 Years','Gender':'Male','Weight':'7.0 lbs','Location':'In Foster','IntakeDate':'2/18/2021'},
  {'ID':'3','Species':'Cat','Name':'Boxie','Age':'5 Years','Gender':'Male','Weight':'10.1 lbs','Location':'In Foster','IntakeDate':'2/19/2021'},
  {'ID':'4','Species':'Cat','Name':'Ever','Age':'6 Years','Gender':'Female','Weight':'9.2 lbs','Location':'In Foster','IntakeDate':'2/20/2021'},
  {'ID':'5','Species':'Cat','Name':'George','Age':'1 Years','Gender':'Male','Weight':'11.6 lbs','Location':'In Foster','IntakeDate':'2/21/2021'},
  {'ID':'6','Species':'Cat','Name':'Sen','Age':'1 Years','Gender':'Female','Weight':'12.2 lbs','Location':'In Foster','IntakeDate':'2/22/2021'},
  {'ID':'7','Species':'Cat','Name':'Storm','Age':'9 Years','Gender':'Female','Weight':'10.7 lbs','Location':'In Foster','IntakeDate':'2/23/2021'},
  {'ID':'8','Species':'Cat','Name':'Larry','Age':'10 Years','Gender':'Male','Weight':'9.4 lbs','Location':'In Foster','IntakeDate':'2/24/2021'},
  {'ID':'9','Species':'Cat','Name':'Dylan','Age':'1 Years','Gender':'Male','Weight':'14.7 lbs','Location':'In Foster','IntakeDate':'2/25/2021'},
  {'ID':'10','Species':'Cat','Name':'Peeps','Age':'4 Years','Gender':'Male','Weight':'9.8 lbs','Location':'In Foster','IntakeDate':'2/26/2021'},
  {'ID':'11','Species':'Cat','Name':'Secret','Age':'6 Years','Gender':'Female','Weight':'12.3 lbs','Location':'In Foster','IntakeDate':'2/27/2021'},
  {'ID':'12','Species':'Cat','Name':'Bella','Age':'2 Years','Gender':'Female','Weight':'8.9 lbs','Location':'In Foster','IntakeDate':'2/28/2021'},
  {'ID':'13','Species':'Cat','Name':'Nicolet','Age':'5 Years','Gender':'Female','Weight':'7.8 lbs','Location':'In Foster','IntakeDate':'3/1/2021'},
  {'ID':'14','Species':'Cat','Name':'Patches','Age':'1 Years','Gender':'Female','Weight':'11.5 lbs','Location':'In Foster','IntakeDate':'3/2/2021'},
  {'ID':'15','Species':'Dog','Name':'Suzy','Age':'7 Years','Gender':'Female','Weight':'57.2 lbs','Location':'In Foster','IntakeDate':'1/3/2021'},
  {'ID':'16','Species':'Dog','Name':'Sima','Age':'5 Years','Gender':'Male','Weight':'38.7 lbs','Location':'In Foster','IntakeDate':'1/4/2021'},
  {'ID':'17','Species':'Dog','Name':'King','Age':'11 Years','Gender':'Male','Weight':'65.7 lbs','Location':'In Foster','IntakeDate':'1/5/2021'},
  {'ID':'18','Species':'Dog','Name':'Mayweather','Age':'3 Years','Gender':'Male','Weight':'59.3 lbs','Location':'In Foster','IntakeDate':'1/6/2021'},
  {'ID':'19','Species':'Dog','Name':'Lexi','Age':'7 Years','Gender':'Female','Weight':'65.6 lbs','Location':'In Foster','IntakeDate':'1/7/2021'},
  {'ID':'20','Species':'Dog','Name':'Lsabella','Age':'3 Years','Gender':'Female','Weight':'49.8 lbs','Location':'In Foster','IntakeDate':'1/8/2021'},
  {'ID':'21','Species':'Dog','Name':'Pj','Age':'3 Years','Gender':'Female','Weight':'54.6 lbs','Location':'In Foster','IntakeDate':'1/9/2021'},
  {'ID':'22','Species':'Dog','Name':'Winter','Age':'4 Years','Gender':'Male','Weight':'43.4 lbs','Location':'In Foster','IntakeDate':'1/10/2021'},
  {'ID':'23','Species':'Dog','Name':'Kennedy','Age':'1 Years','Gender':'Female','Weight':'56.8 lbs','Location':'In Foster','IntakeDate':'1/11/2021'},
  {'ID':'24','Species':'Dog','Name':'Sagat','Age':'3 Years','Gender':'Male','Weight':'73.3 lbs','Location':'In Foster','IntakeDate':'1/12/2021'},
  {'ID':'25','Species':'Dog','Name':'Jackie','Age':'3 Years','Gender':'Female','Weight':'58.2 lbs','Location':'In Foster','IntakeDate':'1/13/2021'},
  {'ID':'26','Species':'Dog','Name':'Penny','Age':'4 Years','Gender':'Female','Weight':'44.2 lbs','Location':'In Foster','IntakeDate':'1/14/2021'},
  {'ID':'27','Species':'Dog','Name':'Johnny','Age':'5 Years','Gender':'Male','Weight':'79.8 lbs','Location':'In Foster','IntakeDate':'1/15/2021'},
  {'ID':'28','Species':'Dog','Name':'Sora','Age':'7 Years','Gender':'Male','Weight':'56.6 lbs','Location':'In Foster','IntakeDate':'1/16/2021'},
]


$('#searchInput').on('keyup', function(){
 var value = $(this).val()
 var data = searchTable(value,animalArray)
 buildTable(data)
})

buildTable(animalArray)

/*Search for the name*/
function searchTable(value,data){
 var filteredData = []

 for(var i = 0; i < data.length; i++){
   value = value.toLowerCase()
   var name = data[i].Name.toLowerCase()

   if(name.includes(value)){
     filteredData.push(data[i])
   }
 }
 return filteredData
}

/* Print out the result*/
function buildTable(data){
 var table = document.getElementById('tableResult')

 table.innerHTML = ''

 for (var i = 0; i < data.length; i++){
   var row = `<tr>
           <td>${data[i].ID}</td>
           <td>${data[i].Species}</td>
           <td>${data[i].Name}</td>
           <td>${data[i].Age}</td>
           <td>${data[i].Gender}</td>
           <td>${data[i].Weight}</td>
           <td>${data[i].Location}</td>
         </tr>`
   table.innerHTML += row
 }
}


/* ---------------- get user Email info , and print out a message ------------------*/
function getEmailInfo(){
  var followerName = document.getElementById('fName').value;
  var followerEmail = document.getElementById('fEmail').value;
  var cat = document.getElementById('fCat').checked;
  var dog = document.getElementById('fDog').checked;
  var text = followerName + ", thank you for subscribing!";

  r = confirm("Dear "+ followerName + " , do you want subscribe to our animal diary?");
  if(r){
    document.getElementById("emailInfo").innerHTML = text;
  }else{
    document.getElementById("emailInfo").innerHTML = ("Thank you for considering it.");
  }
}


// /*Animal waiting list*/
// const addAnimal = document.querySelector('add-animal');
// const animalList = document.querySelector('.animal');
// const animal = [];
//
// function addAnimals(e){
//   e.preventDefault();
//   const text = (this.querySelector('[name=animal]')).value;
//   const item = {
//     text,
//     done:false
//   }
//
//   animal.push(item);
//   populateList(animal,animalList);
//   this.reset();
// }
//
// function populateList(item = [], animalList){
//   animalList.innerHTML = item.map((item,i) =>{
//     return `
//       <li>
//         <label for="">${item.text}</label>
//       </li>
//     `;
//   }).join('');
// }
//
// addAnimal.addEventListener('submit', addAnimals);
