const fetchUser = () => {
    return new Promise((resolve, reject) => {
      setTimeout(() => {
        resolve({ data: { user: "Monkey", admin: true } });
      }, 3000);
    });
  };
  
  const login = (user) => {
    if (user.admin === true) {
      console.log("Successfully logged in!");
    } else {
      console.log("Failed to log in, please try again.");
    }
  };
  
  const useAdmin = async () => {
    const result = await fetchUser();
    console.log(result); // does this have admin?
    login(result.data);
  };
  
  useAdmin();
  console.log("Program complete!");