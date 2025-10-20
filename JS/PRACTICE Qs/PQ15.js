// creating a object literal in js
const Thread = {
    username: "@jatingidh0410",
    content: "Cybersec Methodologies",
    like: 250,
    repost: 75,
    tags: ["@apnacollege","@sigma8"]
};

console.log(Thread["username"]);
console.log(Thread.like);
console.log(Thread.tags[0]);

let repostCount = "repost";
console.log(Thread[repostCount]);

// update val
