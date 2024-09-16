import React, { useEffect, useState } from 'react';
import axios from 'axios'; 

const ViewsAccount = () => {
  const [users, setUsers] = useState([]); // Khai báo state để lưu dữ liệu
  const [loading, setLoading] = useState(true); // Trạng thái loading

  useEffect(() => {
    // Hàm fetch dữ liệu từ API
    const fetchData = async () => {
      try {
        const response = await axios.get('http://localhost:8090/accounts/views'); // Gọi API
        // const data = await response.json(); // Chuyển dữ liệu thành JSON
        setUsers(response.data); // Cập nhật state với dữ liệu mới
        setLoading(false); // Tắt trạng thái loading
      } catch (error) {
        console.error('Error fetching data:', error);
        setLoading(false); // Tắt trạng thái loading nếu lỗi xảy ra
      }
    };

    fetchData(); // Gọi hàm fetch khi component được render
  }, []); // Chỉ gọi useEffect một lần khi component mount

  if (loading) {
    return <div>Loading...</div>; // Hiển thị loading khi đang chờ API phản hồi
  }

  return (
    <div>
      <h1>User List</h1>
      <ul>
        {users.map(user => (
          <li key={user.accid}>
            {user.username} - {user.password}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default ViewsAccount;